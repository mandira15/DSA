import java.util.*;
public class Is_your_horseshoe_on_the_other_hoof {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> horseshoeColors = new HashMap<>();
        for(int i = 0; i < 4; i++){
            int color = sc.nextInt();
            horseshoeColors.put(color , horseshoeColors.getOrDefault(color, 0) + 1); //adding frequency of each element
        }
        int answer = 4 - horseshoeColors.size(); //total - unique colors = answer
        System.out.print(answer);
        
        sc.close();
    }
}
