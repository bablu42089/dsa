package interviewbit;

import java.util.Scanner;


public class Isrectangle {
    public static int solve(int A, int B, int C, int D) {
        if(A==B&&C==D||A==C&&B==D||A==D&&B==C)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int res=solve(a,b,c,d);
        System.out.println(res);
    }
}
