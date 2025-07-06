import java.io.*;
import java.util.*;
public class Numberdistribution
{
        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<a.length;i++)
            {
                a[i]=sc.nextInt();
            }
            int pos=0;
            int neg=0;
            int zero=0;

            for(int i=0;i<n;i++)
            {
                if(a[i]==0)
                {
                    zero+=1;
                }
                else if(a[i]>0)
                {
                    pos+=1;
                }
                else{
                    neg+=1;
                }
            }
            System.out.println(zero+" "+pos+" "+neg);

        }

}
