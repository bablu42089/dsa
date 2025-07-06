package twopoinerandslidingwindow;

import java.util.Scanner;

public class constantwindow {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]= sc.nextInt();
        }
        int k=sc.nextInt();
        int l=0;
        int r=k-1;
        int sum=0;
        for (int i = l; i <= r; i++) {
            sum+=a[i];
        }
        int maxsum=0;
        while(r<(n-1))
        {
         sum=sum-a[l];
         l++;
         r++;
         sum=sum+a[r];
         maxsum=Math.max(maxsum,sum);
        }
        System.out.println(maxsum);
    }
}
