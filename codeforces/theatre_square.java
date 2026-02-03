import java.util.*;
public class theatre_square {
    public static long squareArea(long n, long m , long a){
        long N = n/a + (n%a != 0 ? 1 : 0); // adding one extra tile if there is any remainder
        long M = m/a + (m%a != 0 ? 1 : 0);
        return N*M;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        long a = sc.nextLong();
        System.out.println(squareArea(n, m, a));
    }
}
