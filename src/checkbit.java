import java.util.Scanner;

public class checkbit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        if((n&(1<<m))!=0)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}
