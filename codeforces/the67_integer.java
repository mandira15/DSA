import java.util.*;
public class the67_integer {
    public static int Solve(int x){
        if(x < 67) return x + 1;
        else return x; // when x = 67
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int x = sc.nextInt();
            System.out.println(Solve(x));
        }
        

    }
}
