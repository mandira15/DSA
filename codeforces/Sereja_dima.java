import java.util.*;
public class Sereja_dima {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []m =new int[n];
        for(int i = 0; i < n; i++){
            m[i] = sc.nextInt();
        }
        int l = 0 , r = n - 1;
        int s = 0 , d = 0;
        int turn = 0;
        while(l <= r){
           int pick = 0;
           if(m[l] >= m[r]){
            pick = m[l];
            l++;
           }else{
            pick = m[r];
            r--;
           }
           if(turn == 0){
            s += pick;
           }else{
            d += pick;
           }
           turn = 1 - turn; // switch turn
        }
        System.out.println(s + " " + d);
    }
}
