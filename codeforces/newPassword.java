import java.util.Scanner;
public class newPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            char ch = (char) ('a' + (i % k));
            result.append(ch);
        }

        System.out.println(result.toString());
    }
}
