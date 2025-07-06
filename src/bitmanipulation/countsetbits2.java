package bitmanipulation;

import java.util.Scanner;

public class countsetbits2 {
    static  int countsetbit(int n)
    {
        int count=0;
        while(n!=0)
        {
          n=n&(n-1);
          count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int count=countsetbit(n);
        System.out.println(count);
    }
}
