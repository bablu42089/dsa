package twopoinerandslidingwindow;

import java.util.Scanner;

public class longsubarrbruteforce {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]= sc.nextInt();
        }
        int k=sc.nextInt();
        int maxlen=0,sum=0;
        for (int i = 0; i < n; i++) {
            sum=0;
            for (int j = 0; j < n; j++) {
                sum=sum+a[j];
                if(sum<=k)
                {
                    maxlen=Math.max(maxlen,j-i+1);
                }
            }
        }
        System.out.println(maxlen);
    }
}
