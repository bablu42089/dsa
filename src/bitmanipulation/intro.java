package bitmanipulation;

public class intro {

    public static void main(String[] args)
    {
     String s="0101";
     String bin="";
        for (int i = 0; i < s.length(); i++) {
          if(s.charAt(i)=='1')
          {
              bin+="0";
          }
          else
          {
              bin+="1";
          }

        }
        int x=Integer.parseInt(bin);
        x=x+1;
        bin=Integer.toString(x);
        System.out.println(bin);

    }
}
