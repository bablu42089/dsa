import java.util.Scanner;

public class submtrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=sc.nextInt();
        int j=sc.nextInt();
        int k=sc.nextInt();
        int l=sc.nextInt();

        int [][]matrix=new int[n][n];

        for(int row=0;row<n;row++)
        {
            for(int col=0;col<n;col++)
            {
                matrix[row][col]=sc.nextInt();
            }
        }
        int submat=0;
        for (int row = i; row <=k ; row++) {
            for (int col = j; col <= l ; col++) {
                submat+=matrix[row][col];
            }
            
        }
        System.out.println(submat);
    }
}
