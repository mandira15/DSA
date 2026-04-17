import java.io.*;
import java.util.*;

public class almost_longest_bracket{

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char[] s = br.readLine().toCharArray();

        int[] pre = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            pre[i] = pre[i - 1] + (s[i - 1] == '(' ? 1 : -1);
        }

        int[] minSuf = new int[n + 2];
        minSuf[n] = pre[n];
        for (int i = n - 1; i >= 1; i--) {
            minSuf[i] = Math.min(minSuf[i + 1], pre[i]);
        }

        int ans = 0;

        for (int i = 1; i <= n; i++) {

            if (pre[i - 1] < 0) break;

            if (pre[n] == 2 && s[i - 1] == '(') {
                if (minSuf[i] >= 2) ans++;
            }

            if (pre[n] == -2 && s[i - 1] == ')') {
                if (minSuf[i] >= -2) ans++;
            }
        }

        System.out.println(ans);
    }
}