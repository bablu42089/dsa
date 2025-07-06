import java.util.*;
public class alternateseating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m=sc.nextInt();
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int b[]=new int[10];
        int j=0;
        for(int i=0;i<n&&m>0;i++)
        {
            if(a[i]==0)
            {
                if((i==0||a[i-1]==0) && (i==n-1 || a[i+1]==0))
                {
                    m--;
                    b[j++]=i;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            System.out.print(b[i]+" ");
        }
        if(m==0)
        {
            System.out.println("yes");


        }
        else
        {
            System.out.println("no");
        }

    }
}
