import java.util.*;
public class georgia_accomodation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for(int i = 0; i < n; i++){
            int p = sc.nextInt();
            int q = sc.nextInt();
            if(p + 2 <= q){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
