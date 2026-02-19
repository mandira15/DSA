import java.util.*;
public class parallelipiped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); // ab
        int y = sc.nextInt(); // bc
        int z = sc.nextInt(); // ca

        int a = (int)Math.sqrt((x * z) / y);
        int b = (int)Math.sqrt((x * y) / z);
        int c = (int)Math.sqrt((y * z) / x);

        int result = 4 * (a + b + c);

        System.out.println(result);
        sc.close();
    }
}
