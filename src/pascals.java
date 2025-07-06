import java.util.Scanner;

public class pascals {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=0;
        int j=0;
        int c=0;
        for(i=0;i<n;i++)
        {
            for ( j = 0; j <=i; j++) {
                if(i==0||j==0)
                {
                    c=1;
                }
                else
                {
                    c=(c*(i-j+1))/j;

                }
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}
