import java.util.*;
public class puzzle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //number of students
        int m = sc.nextInt(); //number of puzzles
        int [] puzzles = new int[m];
        int minn = Integer.MAX_VALUE;
        for(int i = 0; i < m ; i++){
            puzzles[i] += sc.nextInt();
        }
        Arrays.sort(puzzles);
        for(int i = 0; i + n - 1 < m; i++){ //sliding window with size n
            int diff = puzzles[i+ n - 1] - puzzles[i];
            minn = Math.min(minn, diff);
        }
        System.out.println(minn);
    }
}
