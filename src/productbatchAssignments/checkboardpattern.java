package productbatchAssignments;
import java.util.Scanner;
public class checkboardpattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int tc=1;tc<=t;tc++)
        {
            int n=sc.nextInt();
            System.out.println("Case #"+tc+":");
            for(int i=0;i<2*n;i++)
            {
                for(int j=0;j<2*n;j++)
                {
                    if((i/2 + j/2)%2==0)
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print("-");
                    }
                }
                System.out.println();
            }


        }

    }
}
