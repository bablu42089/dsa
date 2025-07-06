import java.util.Scanner;

public class rowsum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[][]=new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j]=sc.nextInt();
            }
        }
        int rowsum=0;
        for (int i = 0; i < n; i++) {
            rowsum=0;
            for (int j = 0; j < m; j++) {
                rowsum+=a[i][j];
            }
            System.out.println(rowsum);
        }
    }
}
