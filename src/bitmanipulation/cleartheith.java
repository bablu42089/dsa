package bitmanipulation;

public class cleartheith {
    public static void main(String[] args) {
        int n=13,i=2;
        n= n& ~(1<<i);
        System.out.println(n);
    }
}
