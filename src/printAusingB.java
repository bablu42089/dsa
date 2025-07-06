import java.util.*;
public class printAusingB {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int b[]=new int[m];
        for(int i=0;i<m;i++)
        {
            b[i]=sc.nextInt();
        }


        for (int i = 0; i < m; i++) {
            if(b[i]>n||b[i]<0)
            {
                System.out.println(-1);
            }
            else
            {
                System.out.println(a[b[i]]);
            }

        }
    }
}
