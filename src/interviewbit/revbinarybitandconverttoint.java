package interviewbit;

public class revbinarybitandconverttoint {
    public static void main(String[] args) {
        long a=3;
        String s = Long.toBinaryString(a);
        while (s.length() < 32) {
            s = "0" + s;
        }
        System.out.println(s);
        String rev = "";
        for (int i = 0; i < s.length(); i++)
        {
            rev = s.charAt(i) + rev;
        }
        long x = Long.parseLong(rev, 2);
        System.out.println(x);
    }
}
