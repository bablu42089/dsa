import java.util.*;
public class gauntletspairs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int []f=new int[1001];
        for(int i=0;i<n;i++)
        {
            f[a[i]]=f[a[i]]+1;
        }
        int pairs=0;
        for(int i=0;i<=1000;i++)
        {
            pairs+=f[i]/2;
        }
        System.out.println(pairs);

    }
}
