import java.util.*;
public class new_year_transportation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int pos = 1;
        while(pos < x){
            pos = pos + a[pos - 1]; //array is 0 indexed and pos is 1 indexed
        }
        if(pos == x){
            System.out.println("YES");
        }else if(pos > x){
            System.out.println("NO");
        }
    }
}
