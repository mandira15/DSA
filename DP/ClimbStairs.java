//leetcode 70 Climbing stairs using dp (bottom up approach)
public class ClimbStairs{
    static int CStairs(int n ){
        if(n <= 2) return n;
        int []dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3; i <= n; i++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
    //Main method to test the ClimbStairs function
    public static void main(String[] args){
        int n = 4;
        System.out.println(CStairs(n));
    }
}
