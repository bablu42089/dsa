import java.util.Scanner;

public class numberreverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        String rev="";
        while (n!=0)
        {
            rev+=n%10;
            n=n/10;
        }
        int revv=Integer.parseInt(rev);
        System.out.println(revv);
    }
}
