import java.util.*;
public class permutation_in_string{
    public boolean checkPermut(String s1 , String s2){
        int n = s1.length();
        int m = s2.length();
        if(n > m) return false;
        int[] s1_freq = new int[26];
        int[] s2_freq = new int[26];
        for(char c : s1.toCharArray()){
            s1_freq[c - 'a']++; //adding frequency of each char from s1
        }
        int i = 0, j = 0;
        while(j < m){
            s2_freq[s2.charAt(j) - 'a']++; //adding frequency of each char from s2
            if(j - i + 1 > n){
                s2_freq[s2.charAt(i) - 'a']--; //shrinking window
                i++;
            }if(Arrays.equals(s1_freq , s2_freq)){
                return true;
            }
            j++;
        }
        return false;
    }
    public static void main(String[] args){
        String s1 = "ab";
        String s2 = "eidbaooo";
        permutation_in_string obj = new permutation_in_string();
        System.out.println(obj.checkPermut(s1, s2));
    }
}