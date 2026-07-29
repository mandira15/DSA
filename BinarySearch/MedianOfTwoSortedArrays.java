package BinarySearch;
import java.util.*;
public class MedianOfTwoSortedArrays{
    public double medianSortedArray(int[] nums1 , int[] nums2){
        int m = nums1.length;
        int n = nums2.length;
        int i = 0, j = 0, k = 0;
        int[]temp = new int[m+n];
        while(i < m && j < n){
            if(nums1[i] < nums2[j]){ //sorting array
                temp[k] = nums1[i];
                i++;
                k++;
            }else{
                temp[k] = nums2[j];
                j++;
                k++;
            }
        }
        while(i < m){ // if nums2 is over  but nums1 is still left
            temp[k] = nums1[i];
            i++;
            k++;
        }
        while(j < n){ // if nums1 is over but nums2 is still left
            temp[k] = nums2[j];
            j++;
            k++;
        }
        if(temp.length % 2 == 1){
            return temp[temp.length / 2];
        }
        return (temp[temp.length / 2 - 1] + temp[temp.length / 2])/2.0;
    }
    public static void main(String[] args){
        int []nums1 = {1,3};
        int []nums2 = {2};
        MedianOfTwoSortedArrays obj = new MedianOfTwoSortedArrays();
        
        System.out.println(obj.medianSortedArray(nums1, nums2));
    }
}