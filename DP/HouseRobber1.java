public class HouseRobber1 {
    //Dynamic Programming using bottom up approach to solve the House Robber problem
    static int rob(int[]nums){
        int n = nums.length;
    //null condition or base case
        if(n <= 1) return nums[0];
        int []t = new int[n + 1];
        t[0]= 0; 
        t[1] = nums[0];
        //filling the t array
        for(int i = 2; i <=n;i++){
            int skip = t[i-1];
            int steal = nums[i - 1] + t[i - 2];
            t[i] = Math.max(skip, steal);
        }
        return t[n];
    }
    public static void main(String[] args){
        int[] nums = {1, 2, 3, 1};
        System.out.println(rob(nums));
    }

}
