import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

class Process {
    int id;
    int arrivalTime;
    int burstTime;
    int completionTime;
    int turnaroundTime;
    int waitingTime;

    public Process(int id, int arrivalTime, int burstTime) {
        this.id = id;
        this.arrivalTime = arrivalTime;
        this.burstTime = burstTime;
    }
}

class SchedulerUI extends JFrame implements ActionListener {

    private JTextField arrivalField, burstField;
    private JButton addButton, runButton, loadFileButton;
    private DefaultTableModel tableModel;
    private ArrayList<Process> processList = new ArrayList<>();

    public SchedulerUI() {
        setTitle("Process Scheduling Simulator");
        setSize(750, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        JLabel arrivalLabel = new JLabel("Arrival Time:");
        arrivalField = new JTextField(5);

        JLabel burstLabel = new JLabel("Burst Time:");
        burstField = new JTextField(5);

        addButton = new JButton("Add Process");
        runButton = new JButton("Run FCFS");
        loadFileButton = new JButton("Load from File");

        addButton.addActionListener(this);
        runButton.addActionListener(this);
        loadFileButton.addActionListener(this);

        tableModel = new DefaultTableModel(new String[]{"Process", "Arrival", "Burst", "Completion", "Turnaround", "Waiting"}, 0);
        JTable table = new JTable(tableModel);

        add(arrivalLabel);
        add(arrivalField);
        add(burstLabel);
        add(burstField);
        add(addButton);
        add(runButton);
        add(loadFileButton);
        add(new JScrollPane(table));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            try {
                int arrival = Integer.parseInt(arrivalField.getText());
                int burst = Integer.parseInt(burstField.getText());
                processList.add(new Process(processList.size() + 1, arrival, burst));
                arrivalField.setText("");
                burstField.setText("");
                JOptionPane.showMessageDialog(this, "Process Added!");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Please enter valid numbers.");
            }
        }

        if (e.getSource() == runButton) {
            runFCFS();
        }

        if (e.getSource() == loadFileButton) {
            loadProcessesFromFile();
        }
    }

    private void runFCFS() {
        processList.sort(Comparator.comparingInt(p -> p.arrivalTime));
        int time = 0;
        tableModel.setRowCount(0); // Clear previous data

        for (Process p : processList) {
            if (time < p.arrivalTime) {
                time = p.arrivalTime;
            }
            time += p.burstTime;
            p.completionTime = time;
            p.turnaroundTime = p.completionTime - p.arrivalTime;
            p.waitingTime = p.turnaroundTime - p.burstTime;

            tableModel.addRow(new Object[]{
                    "P" + p.id,
                    p.arrivalTime,
                    p.burstTime,
                    p.completionTime,
                    p.turnaroundTime,
                    p.waitingTime
            });
        }
    }

    private void loadProcessesFromFile() {
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            processList.clear(); // Clear existing processes
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String line;
                int processId = 1;
                while ((line = br.readLine()) != null) {
                    String[] parts = line.split(",");
                    if (parts.length >= 2) {
                        int arrival = Integer.parseInt(parts[0].trim());
                        int burst = Integer.parseInt(parts[1].trim());
                        processList.add(new Process(processId++, arrival, burst));
                    }
                }
                JOptionPane.showMessageDialog(this, "File loaded successfully!");
            } catch (IOException | NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Error reading file: " + ex.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SchedulerUI().setVisible(true));
    }
}