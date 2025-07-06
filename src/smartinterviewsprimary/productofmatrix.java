package smartinterviewsprimary;

import java.util.Scanner;

public class productofmatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int r1=sc.nextInt();
            int c1=sc.nextInt();
            int a[][]=new int[r1][c1];
            for(int i=0;i<r1;i++)
            {
                for(int j=0;j<c1;j++)
                {
                    a[i][j]=sc.nextInt();
                }
            }


            int r2=sc.nextInt();
            int c2=sc.nextInt();
            int b[][]=new int[r2][c2];
            for(int i=0;i<r2;i++)
            {
                for(int j=0;j<c2;j++)
                {
                    b[i][j]=sc.nextInt();
                }
            }


            int res[][]=new int[r1][c2];
            for(int i=0;i<r1;i++)
            {
                for(int j=0;j<c2;j++)
                {
                    int sum=0;
                    for(int k=0;k<c1;k++)
                    {
                        sum+=a[i][k]*b[k][j];
                    }
                    res[i][j]=sum;
                }
            }

            for(int i=0;i<r1;i++)
            {
                for(int j=0;j<c2;j++)
                {
                    System.out.print(res[i][j]+" ");
                }
                System.out.println();
            }
        }

}
