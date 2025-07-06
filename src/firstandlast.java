import java.util.*;
public class firstandlast {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]= sc.nextInt();
        }
        int f= sc.nextInt();
        for (int i = 0; i < n; i++) {
            if(a[i]==f) {
                System.out.print(i + " ");
                break;
            }
        }
        for (int i = n-1; i >=0 ; i--) {
             if(a[i]==f)
             {
                 System.out.print(i+" ");
                 break;
             }
        }
    }
}
