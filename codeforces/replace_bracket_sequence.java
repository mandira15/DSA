import java.util.*;
public class replace_bracket_sequence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        Stack<Character> stack = new Stack<>();
        int changes = 0;

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{' || c == '<') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    System.out.println("Impossible");
                    return;
                }

                char open = stack.pop();

                if (!match(open, c)) {
                    changes++;
                }
            }
        }

        if (!stack.isEmpty()) {
            System.out.println("Impossible");
        } else {
            System.out.println(changes);
        }
    }

    static boolean match(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '[' && close == ']') ||
               (open == '{' && close == '}') ||
               (open == '<' && close == '>');
    }
}
