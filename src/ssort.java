import java.util.Scanner;

public class ssort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int min=0;
        int temp=0;
        for (int i = 0; i < n-1; i++) {
            min=i;
            for (int j = i+1; j < n; j++) {
                if(a[min]>a[j])
                {
                    min=j;
                }
            }
            temp=a[min];
            a[min]=a[i];
            a[i]=temp;
            for (int j = 0; j < n; j++) {
                System.out.print(a[j]+" ");
            }
            System.out.println();
        }
    }
}
