package Stack;
import java.util.*;

public class valid_parentheses {
    public boolean isValid(String s){
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '[') st.push(c);
            else{
                if(st.isEmpty()) return false;
                if(c == ')' && st.peek() != '(' ||
                    c == '}' && st.peek() != '{' ||
                    c == ']' && st.peek() != '['
                ){
                    return false;
                }
                st.pop(); // removing elements after checking 
            }
            
        }
        return st.isEmpty();
    }
    public static void main(String[] args){
        String s = "()[]{}";
        valid_parentheses obj = new valid_parentheses();
        System.out.println(obj.isValid(s));
    }
}
