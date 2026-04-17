package LISVariants;   //leetcode 646
import java.util.*;
public class V1 {
    public int v1LIS(int[][] nums){
        int n = nums.length;
        Arrays.sort(nums, (a, b) -> Integer.compare(a[0], b[0]));
        int[] dp = new int[n + 1];
        int maxLen = 1;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i][1] < nums[j][0]) {
                    dp[j] = Math.max(dp[i], dp[j] + 1);
                    maxLen = Math.max(maxLen, dp[i]);
                }
            }
        }
        return maxLen;
    }
    public static void main(String[] args){
        int[][] nums = {{5,24},{15,25},{27,40},{50,60}};
        V1 lis = new V1();
        System.out.println(lis.v1LIS(nums));
    }
}
