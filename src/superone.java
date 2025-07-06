import java.util.Scanner;

public class superone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int matrix[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        boolean foundsuperone = false;
        for (int i = 1; i < n-1; i++)
        {
            for (int j = 1; j < m-1; j++) {
                if (matrix[i][j] == 1) {
                    if (matrix[i - 1][j - 1] == 0 && matrix[i - 1][j] == 0 && matrix[i - 1][j + 1] == 0 &&
                            matrix[i][j - 1] == 0 && matrix[i][j + 1] == 0 &&
                            matrix[i + 1][j - 1] == 0 && matrix[i + 1][j] == 0 && matrix[i + 1][j + 1] == 0) {
                        foundsuperone = true;
                        break;
                    }
                }
            }
        }
        if(foundsuperone)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}
