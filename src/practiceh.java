import java.util.Scanner;

public class practiceh {
    public String restoreString(String s, int[] indices) {
        String x = "";
        for (int i = 0; i < indices.length; i++) {
            x += s.charAt(indices[i]); // Append characters based on indices
        }
        return x;
    }

    public static void main(String[] args) {
        practiceh obj = new practiceh();
        Scanner sc = new Scanner(System.in);

        // Input the string
        System.out.println("Enter the string:");
        String s = sc.nextLine();

        // Input the indices
        System.out.println("Enter the indices (space-separated):");
        int[] indices = new int[s.length()]; // Set array size based on string length
        for (int i = 0; i < indices.length; i++) {
            indices[i] = sc.nextInt();
        }

        // Restore the string
        String x = obj.restoreString(s, indices);
        System.out.println("Restored string: " + x);

        sc.close(); // Close the scanner
    }
}