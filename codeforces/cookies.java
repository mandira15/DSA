import java.util.*;

public class cookies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] v = new int[n];

        int sum = 0, cnt = 0;

        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
            sum += v[i];
        }

        for (int i = 0; i < n; i++) {
            if (((sum - v[i]) & 1) == 0) { // even check
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
