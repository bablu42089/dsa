import java.util.Scanner;

public class quadraticqeq {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a= sc.nextInt();
        double b= sc.nextInt();
        double c= sc.nextInt();
       findroots(a,b,c);
    }

    public static void findroots(double a,double b,double c)
    {
        double dis=b*b-4*a*c;
        double sqrt=Math.sqrt(Math.abs(dis));

        if(dis>0)
        {
            double r1=(-b+sqrt)/(2*a);
            double r2=(-b-sqrt)/(2*a);
            System.out.printf("%.2f %.2f",r1,r2);
        } else if (dis==0) {
            double root=(-b/(2*a));
            System.out.printf("%.2f %.2f",root,root);
        }
        else
        {
            System.out.println("Imaginary roots");
        }
    }
}
