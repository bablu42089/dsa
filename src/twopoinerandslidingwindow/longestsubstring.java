package twopoinerandslidingwindow;

import java.util.Scanner;

public class longestsubstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int len=0,maxlen=0;
        for (int i = 0; i < s.length(); i++) {
            int hash[]=new int[255];
            for (int j = i; j < s.length() ; j++) {
                if(hash[s.charAt(j)]==1)break;
                len=j-i+1;
                maxlen=Math.max(maxlen,len);
                hash[s.charAt(j)]=1;
            }
        }
        System.out.println(maxlen);
    }
}
