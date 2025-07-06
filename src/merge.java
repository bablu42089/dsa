import java.util.*;
public class merge {



    public static void divide(int a[],int l,int r)
    {
        if(l<r)
        {
            int mid=(l+r)/2;
            divide(a,l,mid);
            divide(a,mid+1,r);
            conquer(a,l,mid,r);
        }
    }
    public static void conquer(int a[],int l,int mid,int r)
    {
        int n1=mid-l+1;
        int n2=r-mid;
        int la[]=new int[n1];
        int ra[]=new int[n2];
        for (int i = 0; i < n1; i++) {
            la[i]=a[l+i];
        }
        for (int i = 0; i < n2; i++) {
            ra[i]=a[mid+1+i];
        }
        int i=0;
        int j=0;
        int k=1;
        while(i<n1&&j<n2)
        {
            if(la[i]<=ra[j])
            {
                a[k]=la[i];
                i++;
            }
            else
            {
                a[k]=ra[j];
                j++;
            }
            k++;
        }
        while(i<n1)
        {
            a[k]=la[i];
            i++;
            k++;
        }
        while(j<n2)
        {
            a[k]=ra[i];
            j++;
            k++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        divide(a,0,n-1);
    }
}
