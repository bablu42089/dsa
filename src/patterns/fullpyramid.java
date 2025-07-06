package patterns;

import java.util.Scanner;

public class fullpyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 1; i <= n ; i++) {
            for (int s=1;s<=n-i;s++)
            {
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <=n-1 ; i++) {
             for(int s=1;s<=i;s++)
             {
                 System.out.print(" ");
             }
             for(int j=1;j<=n-i;j++)
             {
                 System.out.print("*");
             }
            for (int j = 1; j <=n-i-1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
//        for (int i = 1; i <2*n ; i++) {
//            int t=i>n?2*n-i:i;
//            int s=n-t;
//            for(int sp=1;sp<=s;sp++)
//            {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= t ; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
    }
}
