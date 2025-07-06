package patterns;

import java.util.Scanner;

public class leftupdown {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
//        for(int i=1;i<=n;i++)
//        {
//            for(int j=1;j<=i;j++)
//            {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for (int i = 1; i <= n-1 ; i++) {
//            for (int j = 1; j <= n-i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        for (int i = 1; i <=2*n-1 ; i++) {
            int t=i>n?2*n-i:i;
            for (int j = 1; j <= t ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
