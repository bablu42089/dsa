import java.util.*;
public class mergertwoarrags {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]= sc.nextInt();
        }
        int m= sc.nextInt();
        int b[]=new int[m];
        for (int i = 0; i < m; i++) {
            b[i]= sc.nextInt();
        }
        int com[]=new int[n+m];
        for (int i = 0; i < n; i++) {
            com[i]=a[i];
        }
        int j=0;
        for (int i = n; i < n+m; i++) {
            com[i]=b[j++];
        }
        Arrays.sort(com);
        for (int i = 0; i < n+m; i++) {
            System.out.print(com[i]+" ");
        }


    }
}
