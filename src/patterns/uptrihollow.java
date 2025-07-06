package patterns;

import java.util.Scanner;

public class uptrihollow {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for(int s=i;s<=n;s++)
            {
                System.out.print("  ");
            }
            for (int j = 1; j < i ; j++) {
                if(i==n||j==1)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }

            }
            for (int j = 1; j <=i ; j++) {
                if(i==n||j==i)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
       // System.out.println();
    }
}
