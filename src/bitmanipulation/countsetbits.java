package bitmanipulation;

import java.util.Scanner;

public class countsetbits {
  static int countsetbit(int n)
  {
      int count=0;
      while(n>0)
      {
//          if(n%2==1)
//          {
//              count+=1;
//          }
//          n=n/2;

          //2 nd method
          count+=n&1;
          n=n>>1;
      }
      return count;
  }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int count=countsetbit(n);
        System.out.println(count);
    }
}
