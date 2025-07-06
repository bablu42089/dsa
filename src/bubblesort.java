import java.util.*;
public class bubblesort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int temp=0;
        for (int i = 0; i < n; i++) {
            boolean swap=false;
            for(int j=0;j<n-i-1;j++)
            {
                //boolean swap=false;

                if(a[j]>a[j+1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    swap=true;
                }
            }
            for (int j = 0; j < n; j++) {
                System.out.print(a[j]+" ");
            }
            System.out.println();
            if(!swap)
                break;
        }

    }
}
