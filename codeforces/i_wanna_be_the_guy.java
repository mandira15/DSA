import java.util.*;
public class i_wanna_be_the_guy {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();     // levels passed by first player
        int[] x = new int[p];
        for(int i = 0; i < p; i++){
            x[i] = sc.nextInt();
        }

        int q = sc.nextInt();     // levels passed by second player
        int[] y = new int[q];
        for(int i = 0; i < q; i++){
            y[i] = sc.nextInt();
        }

        Set<Integer> s = new HashSet<>();

        for(int i = 0; i < p; i++){
            s.add(x[i]);
        }

        for(int i = 0; i < q; i++){
            s.add(y[i]);
        }

        if(s.size() == n){
            System.out.println("I become the guy.");
        } else {
            System.out.println("Oh, my keyboard!");
        }
    }
}
