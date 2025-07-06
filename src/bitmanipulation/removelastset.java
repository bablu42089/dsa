package bitmanipulation;

import java.util.Scanner;

public class removelastset {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        n=(n&(n-1));
        System.out.println(n);
    }
}
