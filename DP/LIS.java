public class LIS {
    public int checkLIS(int []nums){
        int n = nums.length;
        if (n == 0) { // Handle empty array case
            return 0;
        }
        int[] dp = new int[n];
        // Initialize all dp[i] to 1, as each element itself is an LIS of length 1
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
        }
        int maxLIS = 1;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i ; j++){ // Corrected loop for j: starts from 0, goes up to i-1
                if(nums[j] < nums[i]){
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            // After calculating dp[i] based on all previous elements, update overall maxLIS
            maxLIS = Math.max(maxLIS , dp[i]);
        }
        return maxLIS;
    }
    public static void main(String[] args){
        int[] nums = {10,9,2,5,3,7,101,18};
        LIS lis = new LIS();
        System.out.println(lis.checkLIS(nums));
    }
}
