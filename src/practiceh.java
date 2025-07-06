import java.io.*;
import java.util.*;
public class practiceh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int n=sc.nextInt();
       int a[]=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]= sc.nextInt();
        }
        Arrays.sort(a);
        int i=0;
        int count=0;
        while (i<n-1)
        {
            if(a[i]==a[i+1])
            {
                count++;
                i+=2;
            }
            else
            {
                i++;
            }
        }
        System.out.println(count);

    }
}