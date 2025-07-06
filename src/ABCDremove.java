import java.util.*;
public class ABCDremove {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder res=new StringBuilder(s);
        int i=0;
        while(i<res.length()-1)
        {
            if(res.charAt(i)=='A' && res.charAt(i+1)=='B'||
                    res.charAt(i)=='C'&& res.charAt(i+1)=='D')
            {
                res.delete(i,i+2);
                i=Math.max(0,i-1);
            }
            else
            {
                i++;
            }
        }
        System.out.println(res.length());
    }
}
