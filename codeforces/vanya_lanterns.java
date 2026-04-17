import java.util.*;
public class vanya_lanterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of lanterns
        int l = sc.nextInt(); // length of the street
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int d = 2 * Math.max(a[0] , l - a[n - 1]);; // distance between the first lantern and the start of the street, and the last lantern and the end of the street
        
        for(int i = 1; i < n; i++){
            d = Math.max(d , a[i] - a[i -1]);
        }
        System.out.printf("%.9f\n", d/2.0);
        sc.close();

    }
}
