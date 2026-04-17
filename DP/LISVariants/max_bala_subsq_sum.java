package LISVariants;
import java.util.TreeMap;
import java.lang.Math;

public class max_bala_subsq_sum {
    public long maxBalancedSubseqSum(int nums[]){
        int n = nums.length;
        int arr [] = new int[n + 1];
        for(int i = 0; i < n; i++){
            arr[i] = nums[i] - i;
        }
        TreeMap <Integer, Long> map = new TreeMap<>();
        long ans = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            if(nums[i] <= 0){
                ans = Math.max(ans , nums[i]);
            }
            else{
                long temp = nums[i];
                if(map.floorKey(arr[i]) != null){
                    temp += map.get(map.floorKey(arr[i]));
                }
                while(map.ceilingKey(arr[i]) != null && map.get(map.floorKey(arr[i])) < temp){
                    map.remove(map.ceilingKey(arr[i]));
                }
                if(map.floorKey(arr[i]) == null || map.get(map.floorKey(arr[i])) < temp){
                    map.put(arr[i] , temp);
                }
                ans = Math.max(ans, temp)
            }
        }
        return ans;
    }
    public static void main(String[] args){
        max_bala_subsq_sum obj = new max_bala_subsq_sum();
        int nums[] = {4,2,5,3};
        System.out.println(obj.maxBalancedSubseqSum(nums));
    }
}
