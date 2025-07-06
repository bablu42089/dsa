import java.io.*;
import java.util.*;
public class practiceh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] a = new int[M];
        for (int i = 0; i < M; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < M; i++) {
            if(a[i]==0)
            {
                if((i==0&&a[i+1]==0)||(i==M-1&&a[i-1]==0)||a[i+1]==0&&a[i-1]==0)
                {
                    a[i]=1;
                    N--;
                }
            }
        }
        if (N == 0)
        {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }

        scanner.close();

    }
}