import java.util.*;
public class annagram_in_string {
    public List<Integer> annagram(String s, String p){
        List<Integer> ans  = new ArrayList<>();
        int[] p_freq = new int[26];
        int[] s_freq = new int[26];
        for(char c : p.toCharArray()){
            p_freq[c - 'a']++;    //adding frequency from the p string to p_freq array
        }
        int left = 0 , right = 0;
        while(right < s.length()){
            s_freq[s.charAt(right) - 'a']++; // adding frequency from the s string to s_freq array
            if(right - left + 1 > p.length()){ //condition for shrinking window
                s_freq[s.charAt(left) - 'a']--; //not present in p
                left++;
            }
            if(right - left + 1 == p.length()){
                if(Arrays.equals(p_freq,s_freq)){
                    ans.add(left);
                }
            }
            right++;
        }
        return ans;
    }
    public static void main(String[] args){
        String s = "cbaebabacd";
        String p = "abc";
        annagram_in_string a = new annagram_in_string();
        System.out.println(a.annagram(s , p));
    }
}
