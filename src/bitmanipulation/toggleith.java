package bitmanipulation;

import java.util.Scanner;

public class toggleith {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int i= sc.nextInt();
        int x=(n^(1<<i));
        System.out.println(x);
    }
}
