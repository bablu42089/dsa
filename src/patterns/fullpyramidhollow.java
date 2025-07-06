package patterns;
import java.util.Scanner;
public class fullpyramidhollow {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
//        for (int i = 1; i <= n ; i++) {
//            for (int s=1;s<=n-i;s++)
//            {
//                System.out.print(" ");
//            }
//            for (int j=1;j<=i;j++)
//            {
//                if(j==1) {
//                    System.out.print("*");
//                }
//                else
//                {
//                    System.out.print(" ");
//                }
//            }
//            for (int j = 2; j <= i; j++) {
//                if(j==i) {
//                    System.out.print("*");
//                }
//                else
//                {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//        for (int i = 1; i <=n-1 ; i++) {
//            for(int s=1;s<=i;s++)
//            {
//                System.out.print(" ");
//            }
//            for(int j=1;j<=n-i;j++)
//            {
//                if(j==1) {
//                    System.out.print("*");
//                }
//                else
//                {
//                    System.out.print(" ");
//                }
//            }
//            for (int j = 1; j <=n-i-1 ; j++) {
//                if(j==n-i-1) {
//                    System.out.print("*");
//                }
//                else
//                {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

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

        int mid=n/2;
        for(int i=0;i<n;i++)
        {
            for (int j = 0; j < n; j++) {
                if((i+j)==mid||(j-i)==mid||(i-j)==mid||(i+j)==3*mid)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


    }
}
