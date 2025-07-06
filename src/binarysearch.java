import java.util.*;
public class binarysearch {
    public static  String bs(int arr[],int k)
    {
          int l=0;
          int r=arr.length-1;
          while (l<=r)
          {
              int mid=(l+r)/2;
              if(arr[mid]==k)
              {
                  return "True";
              }
              else if (arr[mid]<k)
              {
                  l=mid+1;
              }
              else{
                  r=mid-1;
              }
          }
        return "False";
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]= sc.nextInt();
        }
        Arrays.sort(a);
        String res=bs(a,k);
        System.out.println(res);
    }
}
