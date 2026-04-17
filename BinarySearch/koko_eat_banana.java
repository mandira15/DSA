package BinarySearch;
import java.util.*;
public class koko_eat_banana {
    public boolean canEat(int[] piles, int givenHour , int h){
        int actual_hours = 0;
        for(int x : piles){
            actual_hours += x / givenHour; //finding the hours required to eat the pile
            if(x % givenHour != 0){
                actual_hours++; //if there is a remainder, we need to eat one more hour to finish the pile
            }
        }
        return actual_hours <= h; //if the actual hours required is less than or equal to the given hours, we can eat all the bananas
    }
    public int minEatingSpeed(int[] piles, int h){
        int l = 1;
        int r = 0;
        for(int x : piles){
            r = Math.max(r , x); //storing the max value of r from the array
        }
        while(l < r){
            int mid = l + (r - l)/2;
            if(canEat(piles , mid , h)){
                r = mid;
            }else{
                l = mid + 1;
            }
        }
        return l;
    }
    public static void main(String[] args){
        int []piles = {3,6,7,11};
        int h = 8;
        int k = new koko_eat_banana().minEatingSpeed(piles , h);
        System.out.println(k);
    }
}
