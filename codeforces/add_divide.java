import java.util.*;
public class add_divide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            int minOps = Integer.MAX_VALUE;
            
            // Try increasing b up to b + 30
            for (int inc = 0; inc <= 30; inc++) {
                int newB = b + inc;
                
                // skip if newB == 1 because division useless
                if (newB == 1) continue;
                
                int tempA = a;
                int ops = inc;
                
                // count divisions
                while (tempA > 0) {
                    tempA /= newB;
                    ops++;
                }
                
                minOps = Math.min(minOps, ops);
            }
            
            System.out.println(minOps);
        }
        
        sc.close();
    }
}


