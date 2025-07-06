import java.util.*;
public class maxatitude {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]= sc.nextInt();
        }
        int maxaltitude=0;
        int curaltitude=0;
        for (int i = 0; i < n; i++) {
            curaltitude=curaltitude+a[i];
            if (curaltitude>maxaltitude)
            {
                maxaltitude=curaltitude;
            }
        }
        System.out.println(maxaltitude);
    }
}
