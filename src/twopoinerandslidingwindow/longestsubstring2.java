package twopoinerandslidingwindow;

import java.util.Scanner;

public class longestsubstring2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.next();
        int l=0,r=0,maxlen=0,len=0;
        int hash[]=new int[255];
        for (int i = 0; i < hash.length; i++) {
            hash[i]=-1;
        }
        while (r<s.length())
        {
            if(hash[s.charAt(r)]!=-1)
            {
                if(hash[s.charAt(r)]>=l)
                {
                    l=hash[s.charAt(r)]+1;
                }
            }
            len=r-l+1;
            maxlen=Math.max(maxlen,len);
            hash[s.charAt(r)]=r;
            r++;
        }
        System.out.println(maxlen);
    }
}
