package bitmanipulation;

import java.util.Scanner;

public class checkgivennumberispowoftwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if((n&(n-1))==0)
        {
            System.out.println("power of 2");
        }
        else
        {
            System.out.println("not power of 2");
        }
    }
}
