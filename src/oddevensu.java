import java.util.*;
public class oddevensu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]= sc.nextInt();
        }
        int oddsum=0;
        int evensum=0;
        for (int i = 0; i < n; i++) {
            if(a[i]%2==0)
            {
                evensum+=a[i];
            }
            else
            {
                oddsum+=a[i];
            }
        }
        System.out.print(oddsum+" "+evensum);
    }
}
