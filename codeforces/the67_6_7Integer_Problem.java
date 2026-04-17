import java.util.*;
public class main{
    public static int Solve(int[] x){
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < 7; i++){
            sum += x[i];
            max = Math.max(max, x[i]);
        }

        return 2 * max - sum;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int[] x = new int[7];
            for(int i = 0; i < 7; i++){
                x[i] = sc.nextInt();
            }

            System.out.println(Solve(x));
        }
    }
}
