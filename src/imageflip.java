import java.io.*;
import java.util.*;

public class imageflip {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc=new Scanner(System.in);
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
        //   int b[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m/2;j++)
            {
                int temp=a[i][j];
                a[i][j]=a[i][m-1-j];
                a[i][m-1-j]=temp;
            }
            for(int j=0;j<m;j++)
            {
                a[i][j]=1-a[i][j];
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}