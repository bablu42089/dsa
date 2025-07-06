import java.util.Scanner;

public class interchangeingdiags {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
          int temp=a[i][i];
          a[i][i]=a[i][n-1-i];
          a[i][n-1-i]=temp;
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
