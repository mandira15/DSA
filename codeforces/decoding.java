import java.io.StringReader;
import java.util.*;

public class decoding{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        String s = sc.next();

        Deque<Character> dq = new ArrayDeque<>();

        for(int i = 0; i < t; i++){
            char c = s.charAt(i);

            if((t % 2 == 0 && i % 2 == 0) || (t % 2 == 1 && i % 2 == 1)){
                dq.addFirst(c);
            } else {
                dq.addLast(c);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(char c : dq){
            sb.append(c);
        }

        System.out.println(sb);
    }
}