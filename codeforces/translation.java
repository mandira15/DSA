import java.util.*;
public class translation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        if (s.length() != t.length()) {
            System.out.println("NO");
            return;
        }
        int j = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != t.charAt(j)) {
                System.out.println("NO");
                return;
            }
            j++;
        }
        System.out.println("YES");
    }
}
