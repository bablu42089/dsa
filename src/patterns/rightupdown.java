package patterns;

import java.util.Scanner;

public class rightupdown {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int s=1;s<=n-i;s++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= n-1 ; i++) {
            for (int s = 1; s <= i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n-i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
