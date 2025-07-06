import java.util.*;
public class bsearsh {

        public static void main(String[] args) {
            System.out.println("Hello World");
            Scanner sc =new Scanner(System.in);
            int n =sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();

            }
            int low =0;
            int high=n-1;
            boolean found =false;
            int key =sc.nextInt();
            while(low<=high){
                int mid =low+(high-low)/2;
                if(a[mid]==key){
                    found =true;
                    if(mid==n-1){
                        System.out.println(mid);

                        return;
                    }
                    else if(a[mid]!=a[mid+1]){
                        System.out.println(mid+"  mm");
                        return;

                    }
                    else{
                        low =mid+1;
                    }

                }else if(a[mid]>key){
                    high=mid-1;
                }else {
                    low =mid+1;
                }
            }
            if(!found){
                System.out.print("no found");
            }
        }
    }


