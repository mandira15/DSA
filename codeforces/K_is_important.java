import java.util.*;
public class Main {
    


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int k = sc.nextInt();

            ArrayList<Long> a = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                a.add(sc.nextLong());
            }

            long score = 0;

            while (a.size() >= k) {

                int m = a.size();

                // k-th element from left
                int left = k - 1;

                // k-th element from right
                int right = m - k;

                if (a.get(left) >= a.get(right)) {

                    score += a.get(left);
                    a.remove(left);

                } else {

                    score += a.get(right);
                    a.remove(right);
                }
            }

            System.out.println(score);
        }

        sc.close();
    }
}
