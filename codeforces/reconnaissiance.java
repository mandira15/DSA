import java.util.*;
public class reconnaissiance {
    
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            int m = Integer.MAX_VALUE; //minimum difference
            int a = 0, b=0; //to store the indices of pair
            for(int i = 1; i < n; i++){
                int c = Math.abs(arr[i] - arr[i - 1]); //finding absolute difference
                if(c < m){
                    m = c;
                    a = i - 1;
                    b = i ;
                }
            }
            int lastDiff = Math.abs(arr[n - 1] - arr[0]); //checking circular pair
            if(lastDiff < m){
                a = n - 1;
                b = 0;
            }
            System.out.println((a + 1) + " "+ (b + 1));
            sc.close();
    }
}
