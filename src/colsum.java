import java.util.Scanner;

public class colsum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        int colsum=0;
        for (int i = 0; i < m; i++) {
            colsum=0;
            for (int j = 0; j < n; j++) {
              colsum+=a[j][i];
            }
            System.out.println(colsum);
        }


    }
}
