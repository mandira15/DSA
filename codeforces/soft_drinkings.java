import java.util.*;

public class soft_drinkings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();
        int nl = sc.nextInt();
        int np = sc.nextInt();

        int totalDrink = k * l;       // total ml drink
        int totalSlices = c * d;      // total lime slices

        int toastFromDrink = totalDrink / nl;
        int toastFromLime = totalSlices;
        int toastFromSalt = p / np;

        int totalToasts = Math.min(toastFromDrink, Math.min(toastFromLime, toastFromSalt));

        System.out.println(totalToasts / n);
    }
}
