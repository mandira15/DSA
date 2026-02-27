import java.util.*;
public class regular_bracket_sequence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int open = 0;
        int pairs = 0;

        for(char c : s.toCharArray()) {
            if(c == '(') {
                open++;
            }
            else {
                if(open > 0) {
                    open--;
                    pairs++;
                }
            }
        }
        System.out.println(pairs * 2);
    }
}
