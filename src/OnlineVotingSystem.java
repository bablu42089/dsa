import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class OnlineVotingSystem {

    private static HashMap<String, Integer> candidates = new HashMap<>();
    private static HashMap<String, Boolean> voters = new HashMap<>();
    private static final String ADMIN_PASSWORD = "69";  // Set your password here

    public static void main(String[] args) {
        // Initialize some candidates
        candidates.put("Ashrith", 0);
        candidates.put("Bablu", 0);
        candidates.put("Adarsh", 0);
        candidates.put("nithin", 0);
        candidates.put("navven" ,+ 0);
        candidates.put("swaran", 0);



        // Create the main frame
        JFrame frame = new JFrame("Online Voting System");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create components
        JLabel voterIdLabel = new JLabel("Enter Voter ID:");
        JTextField voterIdField = new JTextField(15);
        JLabel candidateLabel = new JLabel("Choose Candidate:");
        JComboBox<String> candidateComboBox = new JComboBox<>(candidates.keySet().toArray(new String[0]));
        JButton voteButton = new JButton("Vote");
        JButton resultsButton = new JButton("View Results");
        JTextArea resultsArea = new JTextArea(10, 30);
        resultsArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(resultsArea);

        // Add action listener for voting
        voteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String voterID = voterIdField.getText();
                String candidate = (String) candidateComboBox.getSelectedItem();

                if (voterID.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Voter ID cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                if (voters.containsKey(voterID) && voters.get(voterID)) {
                    JOptionPane.showMessageDialog(frame, "You have already voted!", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    candidates.put(candidate, candidates.get(candidate) + 1);
                    voters.put(voterID, true);
                    JOptionPane.showMessageDialog(frame, "Thank you for voting!");
                    voterIdField.setText(""); // Clear the voter ID field
                }
            }
        });

        // Add action listener for viewing results
        resultsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Prompt for password
                String password = JOptionPane.showInputDialog(frame, "Enter admin password to view results:");

                if (password != null && password.equals(ADMIN_PASSWORD)) {
                    // Show the results if the password is correct
                    StringBuilder results = new StringBuilder("Voting Results:\n");
                    for (Map.Entry<String, Integer> entry : candidates.entrySet()) {
                        results.append(entry.getKey()).append(": ").append(entry.getValue()).append(" votes\n");
                    }
                    resultsArea.setText(results.toString());
                } else {
                    JOptionPane.showMessageDialog(frame, "Incorrect password!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Create a panel and add components
        JPanel panel = new JPanel();
        panel.add(voterIdLabel);
        panel.add(voterIdField);
        panel.add(candidateLabel);
        panel.add(candidateComboBox);
        panel.add(voteButton);
        panel.add(resultsButton);
        panel.add(scrollPane);

        // Add panel to frame
        frame.add(panel);
        frame.setVisible(true);
    }
}
