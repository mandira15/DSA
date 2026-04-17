import java.util.*;

public class longest_regular_bracket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Stack<Integer> stack = new Stack<>();
        stack.push(-1); // base indexing for valid substring calculation
        int maxLen = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);   // new base
                } else {
                    int len = i - stack.peek();
                    if (len > maxLen) {
                        maxLen = len;
                        count = 1;
                    } else if (len == maxLen) {
                        count++;
                    }
                }
            }
        }
        if (maxLen == 0) {
            System.out.println("0 1");
        } else {
            System.out.println(maxLen + " " + count);
        }
    }
}

