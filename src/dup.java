import java.util.*;
public class dup {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       // Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]= sc.nextInt();
        }
        int dup=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(a[i]==a[j])
                {
                    dup=a[j];
                }
            }
        }
        System.out.println(dup);
    }
}
