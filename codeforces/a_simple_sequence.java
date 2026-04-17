import java.util.*;
public class a_simple_sequence {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            
            if (n == 2) {
                System.out.println("2 1");
                continue;
            }
            
            System.out.print("2 ");
            
            for (int i = n; i >= 3; i--) {
                System.out.print(i + " ");
            }
            
            System.out.println("1");
        }
    }
}
