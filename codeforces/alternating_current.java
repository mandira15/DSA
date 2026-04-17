import java.util.*;
public class alternating_current {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop(); // cancel pair
            } else {
                stack.push(c);
            }
        }

        if (stack.isEmpty()) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
