import java.util.*;

public class next_round {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int k = sc.nextInt();
        int ans = 0;
        int[] scores = new int[n];
        for(int i = 0; i < n; i++){
            scores[i] = sc.nextInt();
        }
        int ref = scores[k - 1]; //since k is 1-based indexing value and we are using 0-based indexing in array
        int i = 0;
        while(i < n){
            if(scores[i] >= ref && scores[i] > 0){
                ans++;
            }
            i++;
        }

        System.out.println(ans);
        
    }
}
