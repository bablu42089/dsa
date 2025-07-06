package twopoinerandslidingwindow;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class fruitsbasketsbruteforce {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int a[]=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]= sc.nextInt();
        }
        int maxlength=0;

        for (int i = 0; i < n; i++) {
            Set<Integer> s=new HashSet<>();
            for (int j = i; j <n ; j++) {
                s.add(a[j]);
                if(s.size()<=2)
                {
                    maxlength=Math.max(maxlength,j-i+1);
                }
                else
                {
                    break;
                }
            }
        }
        System.out.println(maxlength);
    }
}
