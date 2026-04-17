import java.util.*;
public class i_love_username {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int first = sc.nextInt();
        int max = first;
        int min = first;

        int count = 0;

        for (int i = 1; i < n; i++) {
            int x = sc.nextInt();

            if (x > max) {
                count++;
                max = x;
            } else if (x < min) {
                count++;
                min = x;
            }
        }

        System.out.println(count);
    }
}
