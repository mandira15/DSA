import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long minVal = Math.min(a, (Math.min(b, c)));
            long maxVal = Math.max(a, (Math.max(b, c)));
            long minRange = a + b + c - minVal - maxVal;
            System.out.println(Math.min(maxVal - minVal,minRange));
        }
    }
}
