package twopoinerandslidingwindow;

import java.util.Scanner;

public class maxconsecutiveonesatmostkzerosslidingwindow {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int a[]=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]= sc.nextInt();
        }
        int k= sc.nextInt();
        int l=0,r=0,maxlen=0,len=0,zeros=0;
        while(r<a.length)
        {
            if(a[r]==0)
            {
                zeros++;
            }
            while (zeros>k)
            {
                if(a[l]==0)
                {
                    zeros--;
                }
                l++;
            }
            if(zeros<=k)
            {
                len=r-l+1;
                maxlen=Math.max(len,maxlen);
            }
            r++;
        }
        System.out.println(maxlen);
    }
}
