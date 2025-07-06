package twopoinerandslidingwindow;

import java.util.Scanner;

public class longsubarrayslidingwindow {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int l=0;
        int r=0;
        int sum=0;
        int maxlength=0;
        while (r<n)
        {
            sum=sum+a[r];
            while(sum>k)
            {
                sum=sum-a[l];
                l++;
            }
            if(sum<=k)
            {
                maxlength=Math.max(maxlength,r-l+1);
            }
            r++;
        }
        System.out.println(maxlength);
    }
}
