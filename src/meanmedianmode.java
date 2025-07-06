import java.util.*;
public class meanmedianmode {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++)
        {
            a[i]= sc.nextInt();
        }
        Arrays.sort(a);
        double mean=0;
        for (int i = 0; i < n; i++) {
            mean+=a[i];
        }
        System.out.print(mean/n+" ");
        double median=0;
       if(n%2==0)
       {
           median=(a[n/2]+a[n/2-1])/2.0;
       }
       else
       {
           median=a[n]/2;
       }
        System.out.print(median+" ");


       double mode=-1;
       int maxapp=-1;
     //  int count=0;
        for (int i = 0; i < n; i++) {
            int count=0;
            for (int j = i; j < n; j++) {
                if(a[j]==a[i])
                {
                   count++;
                }
            }
            if(count>maxapp)
            {
                mode=a[i];
                maxapp=count;
            }
        }
        System.out.println(mode);
    }
}
