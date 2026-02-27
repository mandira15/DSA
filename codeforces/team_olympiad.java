import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class team_olympiad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> p = new ArrayList<>();
        List<Integer> m = new ArrayList<>();
        List<Integer> pe = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();

            if (x == 1) p.add(i);
            else if (x == 2) m.add(i);
            else pe.add(i);
        }

        int teams = Math.min(p.size(), Math.min(m.size(), pe.size()));
        System.out.println(teams);

        for (int i = 0; i < teams; i++) {
            System.out.println(p.get(i) + " " + m.get(i) + " " + pe.get(i));
        }

        sc.close();
    }
}
