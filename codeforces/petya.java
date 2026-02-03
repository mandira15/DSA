import java.util.Scanner;

public class petya {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean neg = s.charAt(0) == '-';
        String num = neg ? s.substring(1) : s;
        // remove leading zeros
        num = num.replaceFirst("^0+(?!$)", "");

        if (num.length() > 19) {
            System.out.println("BigInteger");
            return;
        }

        String[] maxVals = {
                "127",
                "32767",
                "2147483647",
                "9223372036854775807"
        };

        String[] minVals = {
                "128",
                "32768",
                "2147483648",
                "9223372036854775808"
        };

        String[] types = { "byte", "short", "int", "long" };

        for (int i = 0; i < 4; i++) {
            String limit = neg ? minVals[i] : maxVals[i];

            if (num.length() < limit.length() ||
                    (num.length() == limit.length() && num.compareTo(limit) <= 0)) {
                System.out.println(types[i]);
                return;
            }
        }

        System.out.println("BigInteger");
    }
}
