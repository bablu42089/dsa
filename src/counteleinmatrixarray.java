import java.util.Scanner;

public class counteleinmatrixarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int m=sc.nextInt();
        int a[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for (int j = 0; j < m; j++) {
                a[i][j]= sc.nextInt();
            }
        }

        int x= sc.nextInt();
        int arr[]=new int[x];
        for (int i = 0; i < x; i++) {
            arr[i]= sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int c=0;
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < x; k++) {
                    if (a[i][j]==arr[k])
                    {
                        c++;
                        break;
                    }
                }
            }
            System.out.println(c);
        }
    }
}
