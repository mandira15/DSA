import java.lang.Math ;
public class max_alternating_subsq_sum {
    public static long altSubSeq( int nums[] ){
        int n = nums.length ;
        //dp length is inc for considering previous value
        long dp[][] = new long[n + 1][2]; //2 is for even : 0 & odd: 1
        for(int i = 1; i < n + 1; i++){
            dp[i][0] = Math.max(dp[i - 1][1] - nums[i - 1] ,dp[i - 1][0]); // considering both take and skip then pulling out max  out of these two for even length case
            dp[i][1] = Math.max(dp[i - 1][0] + nums[i - 1], dp[i - 1][1]); // considering both take and skip then pulling out max  out of these two for odd length case
        }
        return Math.max(dp[n][0], dp[n][1]); // returning max of both even and odd length subsequence sum)
    }
    public static void main(String[] args){
        int nums[] = {4,2,5,3};
        System.out.println(altSubSeq(nums));
    }
}
