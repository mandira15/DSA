import java.math.BigInteger;
import java.util.Scanner;
public class die_roll {
    public static void dieRoll(int y, int w){
        int maxi = Math.max(y, w);
        int count = 6 - maxi + 1;
        int den = 6;
        int g = BigInteger.valueOf(count).gcd(BigInteger.valueOf(den)).intValue();
        count /= g;
        den /= g;

        System.out.println(count + "/" + den);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int w = sc.nextInt();
        dieRoll(y, w);
    }
}
