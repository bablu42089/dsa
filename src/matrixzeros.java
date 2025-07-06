import java.util.Scanner;

public class matrixzeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[n][n];

        // Input matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        //// First pass: mark positions to be zeroed with -1
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] == 0) {
                    // Mark row
                    for (int k = 0; k < n; k++) {
                        if (a[i][k] != 0) {
                            a[i][k] = -1;
                        }
                    }
                    // Mark column
                    for (int k = 0; k < n; k++) {
                        if (a[k][j] != 0) {
                            a[k][j] = -1;
                        }
                    }
                }
            }
        }

        // Second pass: replace all -1 with 0
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] == -1) {
                    a[i][j] = 0;
                }
            }
        }

        // Print final matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
