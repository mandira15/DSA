package PriorityQueue;
import java.util.Scanner;
import java.util.PriorityQueue;

public class K_largest_element {
    public int largestElement(int[] nums, int k){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int n : nums){
            minHeap.offer(n);
            if(minHeap.size() > k){
                minHeap.remove();
            }
        }
        return minHeap.peek();
    }
    public static void main(String[] args){
        int k = 2;
        int[] nums = {3,2,1,5,6,4};
        K_largest_element obj = new K_largest_element();
        int ans  = obj.largestElement(nums, k);
        System.out.println(ans);

    }
}
