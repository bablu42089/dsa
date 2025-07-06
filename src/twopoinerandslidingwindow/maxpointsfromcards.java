package twopoinerandslidingwindow;

import java.util.Scanner;

public class maxpointsfromcards {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();

        int lsum=0,rsum=0,maxsum=0;
        for (int i = 0; i < k; i++) {
            lsum=lsum+a[i];
        }
        maxsum=lsum;
        int rindex=n-1;
        for (int i = k-1; i >=0 ; i--) {
            lsum=lsum-a[i];
            rsum=rsum+a[rindex];
            rindex--;
            maxsum=Math.max(maxsum,lsum+rsum);
        }
        System.out.println(maxsum);
    }
}
