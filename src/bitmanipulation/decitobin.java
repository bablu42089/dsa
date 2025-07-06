package bitmanipulation;

import java.util.Scanner;

public class decitobin {
    public static String bin(int n)
    {
        String res="";
        while(n!=0)
        {
            if(n%2==1)
            {
                res="1"+res;//directly revserign here
            }
            else
            {
                res="0"+res;
            }
            n=n/2;
        }
        return res;


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=bin(n);
        System.out.println(s);
    }
}
