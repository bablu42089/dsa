import java.util.Scanner;

public class trianglevalidatr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        if((n+m>k)&&(n<m+k)&&(n+k>m))
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}
