import java.util.*;
public class petr_book {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[7];

        for(int i = 0; i < 7; i++){
            a[i] = sc.nextInt();
        }

        int day = 0;

        while(true){
            n -= a[day];
            if(n <= 0){
                System.out.println(day + 1);
                break;
            }
           day = (day + 1) % 7;
        }
    }
}
