import java.util.Scanner;

public class uniform_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            StringBuilder sb = new StringBuilder();

            for(int i = 0; i < n; i++) {
                char ch = (char)('a' + (i % k));
                sb.append(ch);
            }

            System.out.println(sb.toString());
        }
    }
}
