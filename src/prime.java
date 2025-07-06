import java.util.Scanner;

public class prime {

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

//        int count=0;
//        for (int i = 1; i <= Math.sqrt(n) ; i++) {
//            if(n%i==0)
//            {
//                count++;
//                if(n/i!=i)
//                {
//                    count++;    optimized approach
//                }
//            }
//        }
//        if(count==2) {
//            return true;
//        }
//        return false;
    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        if(isprime(n))
        {
            System.out.println(n+"is prime");
        }
        else
        {
            System.out.println(n+"is not a prime number");
        }
    }
}
