import java.util.Scanner;

public class sparsemat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for (int j = 0; j < m; j++) {
                a[i][j]= sc.nextInt();
            }
        }
        int c=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j]==0) {
                    c++;
                }
            }
        }

        if(c>n*m/2)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
