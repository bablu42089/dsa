package interviewbit;

import java.util.Scanner;

public class bishopmoves {
    public static int solve(int A, int B) {
//        int topLeft = Math.min(A - 1, B - 1);
//        int topRight = Math.min(A - 1, 8 - B);
//        int bottomLeft = Math.min(8 - A, B - 1);
//        int bottomRight = Math.min(8 - A, 8 - B);
//        return topLeft + topRight + bottomLeft + bottomRight;
        int count=-1;
        for (int i = 1; i <=8 ; i++) {
            for (int j = 1; j <=8 ; j++) {
                if(Math.abs(i-A)==Math.abs(j-B))
                {
                    count++;
                }
                else
                {
                    //
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int res=solve(a,b);
        System.out.println(res);
    }
}
