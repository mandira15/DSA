package String;
import java.util.*;

public class longest_substring_without_duplicates {
    public int lengthOfLongestSubstring(String s){
        int left = 0; // sliding window left pointer
        int maxLen = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int right = 0; right < s.length(); right++){ //creating a window with two pointers left and right
            char ch = s.charAt(right);
            if(map.containsKey(ch)){
                left = Math.max(left, map.get(ch) + 1); // if found then window will start from the next index of the last occurrence of the character
            }else{
                map.put(ch, right);  //if not found then add it to map with its index
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }
        return maxLen;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s  = sc.nextLine();
        longest_substring_without_duplicates a = new longest_substring_without_duplicates();
        sc.close();
        System.out.println(a.lengthOfLongestSubstring(s));
    }
}
