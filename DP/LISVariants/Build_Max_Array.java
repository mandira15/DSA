package LISVariants;
import java.util.*;


public class Build_Max_Array{
    private int[][][] t;
    private int N,M,K ;
    private final int MOD = 1000000007;
    private int solve(int idx, int searchCost, int maxSoFar){
        if(idx == N){
            if(searchCost == K){
                return 1;
            }
            return 0;
        }
        //Pruning: if we cant reach K searchCost , we'll stop.
        if(searchCost > K){
            return 0;
        }
        // check whether this state is already computed or not
        if(t[idx][searchCost][maxSoFar] != -1){
            return t[idx][searchCost][maxSoFar];
        }
        int result = 0 ;
        //cas1: choose a number from [1, maxSoFar]
        for(int i = 1; i <= M; i++){
            if(i > maxSoFar){
                result = (result + solve(idx + 1, searchCost + 1, i)) % MOD;
            }
            else{
                result = (result + solve(idx + 1, searchCost, maxSoFar)) % MOD;
            }
        }
        return t[idx][searchCost][maxSoFar] = result;
    }
    public int numOfArrays(int n , int m , int k){
        N = n;
        M = m;
        K = k;
        t = new int[n + 1][m + 1][k + 1];
        for(int i = 0; i <= n; i++){
            for(int j = 0; j <=m; j++){
                Arrays.fill(t[i][j] , -1);
            }
        }
        return solve(0 , 0 ,0);
    }









// // This class solves the "Build Array Where You Can Find The Maximum Exactly K Comparisons" problem (LeetCode 1420)
// public class Build_Max_Array {
//     private int[][][] t;
//     private int N,M,K;
//     private final int MOD = 1000000007;

//     private int solve(int idx, int searchCost, int maxSoFar) {
//         if(idx == N){
//             if(searchCost == K) {
//                 return 1;
//             }
//             return 0;
//         }

//         // Pruning: if we can't reach K search_cost, we can stop.
//         if (searchCost > K) {
//             return 0;
//         }
//         if(t[idx][searchCost][maxSoFar] != -1){
//             return t[idx][searchCost][maxSoFar];
//         }

//         int result = 0;
//         // Case 1: Choose a number from [1, maxSoFar].
//         // The new element is not greater than maxSoFar, so searchCost doesn't increase.
//         result = (int) ((long)maxSoFar * solve(idx + 1, searchCost, maxSoFar) % MOD);

//         // Case 2: Choose a number from [maxSoFar + 1, M].
//         // The new element is greater than maxSoFar, so searchCost increases by 1.
//         for(int i = 1; i <= M; i++){
//             if(i > maxSoFar){
//                 result = (result + solve(idx + 1, searchCost + 1, i)) % MOD;
//             }
//         }
//         return t[idx][searchCost][maxSoFar] = result;
//     }

//     public int numOfArrays(int n, int m, int k) {
//         N = n;
//         M = m;
//         K = k;
//         t = new int[n + 1][k + 1][m + 1];
//         for (int i = 0; i <= n; i++) {
//             for (int j = 0; j <= k; j++) {
//                 Arrays.fill(t[i][j], -1);
//             }
//         }
//         return solve(0, 0, 0);
//     }

    public static void main(String[] args){
        Build_Max_Array builder = new Build_Max_Array();
        // Example from LeetCode: n = 2, m = 3, k = 1
        System.out.println(builder.numOfArrays(2, 3, 1)); // Output: 6
    }
}
