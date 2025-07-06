package bitmanipulation;

import java.util.Scanner;

public class ithsetbit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=sc.nextInt();
      //by left shit
        if((n&(1<<i))!=0)
        {
            System.out.println("the "+i+" th bit is set by using left shift");
        }
        else
        {
            System.out.println("unset");
        }
        //by right shift
       if(((n>>i)&1)==1)
       {
           System.out.println("the "+i+" th bit is set by using right shift");

       }
       else
       {
           System.out.println("unset");
       }
    }
}
