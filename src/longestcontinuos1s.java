import java.util.*;
public class longestcontinuos1s {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        int cl=0;
        int ml=0;
        for (int i = 0; i < n; i++) {
            if(a[i]==1)
            {
                cl++;
            }
            else
            {
                ml=Math.max(ml,cl);
                cl=0;
            }
        }
        System.out.println(ml);
    }
}
