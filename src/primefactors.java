import java.util.ArrayList;
import java.util.Scanner;

public class primefactors {
    public static boolean isprime(int n)
    {
        int count=0;
        for (int i = 1; i <=n ; i++) {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count==2) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> a=new ArrayList<>();
        int count=0;
        for(int i=2;i<=n;i++)
        {
            if(n%i==0)
            {
                if(isprime(i))
                {
                    a.add(i);
                    count++;
                }
            }
        }
        for (int i = 0; i < count; i++) {
            System.out.print(a.get(i)+" ");
        }
    }
}
