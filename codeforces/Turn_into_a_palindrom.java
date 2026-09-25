import java.util.Scanner;

public class Turn_into_a_palindrom {
    public int palindrome(int m, char c, String s) {
        char ch[] = s.toCharArray();
        int l = 0, r = m - 1;
        int count = 0;
        while (r >= 0) {
            if (ch[l] == ch[r]) {
                l++;
                r--;
            } else if (ch[l] != ch[r]) {
                if (ch[l] == c) {
                    ch[r] = c;
                    count++;
                } else {
                    ch[l] = c;
                    count++;
                }
                l++;
                r--;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n > 0) {
            int m = sc.nextInt();
            char c = sc.next().charAt(0);
            String s = sc.next();
            Turn_into_a_palindrom obj = new Turn_into_a_palindrom();
            System.out.println(obj.palindrome(m, c, s));
            n--;
        }
    }
}
