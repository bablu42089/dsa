package bitmanipulation;

import java.util.Scanner;

public class bintodeci {
     public static int dec(String s)
     {
         int len=s.length();
         int num=0,p2=1;
         for (int i = len-1; i >=0 ; i--) {
             if(s.charAt(i)=='1')
             {
                 num=num+p2;
             }
             p2=p2*2;
         }
         return num;
     }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=dec(s);
        System.out.println(n);
    }
}
