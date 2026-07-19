//Q76 Leetcode 

import java.util.*;

public class min_window_substring {
    public String minWindow(String s, String t) {
        int n = s.length();
        // edge case
        if (t.length() < n)
            return "";
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);

        }
        int i = 0, j = 0, start_i = 0;
        int requiredCount = t.length();
        int minWindow = Integer.MAX_VALUE;
        while (j < n) {
            char ch = s.charAt(j);
            if (map.containsKey(ch) && map.get(ch) > 0) {
                requiredCount--;
            }
            map.put(ch, map.getOrDefault(ch, 0) - 1);
            while (requiredCount == 0) {
                int currWindow = j - i + 1;
                if (minWindow > currWindow) {
                    minWindow = currWindow;
                    start_i = i;
                }
                char startChar = s.charAt(i);
                if (map.containsKey(startChar) && map.get(startChar) > 0) {
                    requiredCount++;
                }
                i++;
            }
            j++;
        }
        return minWindow == Integer.MAX_VALUE ? "" : s.substring(start_i, start_i + minWindow);
    }
}