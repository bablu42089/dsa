import java.util.*;
public class SumOfmatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[][]=new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int x=sc.nextInt();
        int y=sc.nextInt();
        int b[][]=new int[x][y];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        int sum[][]=new int[n][y];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < y; j++) {
                sum[i][j]=a[i][j]+b[i][j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
}
