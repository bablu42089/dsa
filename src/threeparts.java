import java.util.Scanner;

public class threeparts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int m = sc.nextInt();
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int totslsum=0;
        for(int i:a)
        {
            totslsum+=i;
        }
        if (totslsum%3!=0)
        {
            System.out.println(false);
            return;
        }
        int tgsum=totslsum/3;
        int cursum=0;
        int partitions=0;
        for (int i = 0; i < n; i++) {
            cursum+=a[i];
            if(cursum==tgsum) {
                partitions++;
                cursum = 0;
            }
        }
        if(partitions>=3)
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }
    }
}

