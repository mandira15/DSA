import java.util.*;
public class magnets {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 1; i < n; i++){
            if(arr[i] != arr[i-1]){
                count++;
            }
        }
        System.out.println(count + 1); // +1 because the first magnet is always a new group
    }
}
