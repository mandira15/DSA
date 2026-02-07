import java.util.*;
public class Football_A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < t; i++){
            String name = sc.next();
            // update map using name
            map.put(name , map.getOrDefault(name , 0) + 1);
        }
        int max = 0;
        String ans = "";
        for(String key : map.keySet()){ //taking keys from map
            int val = map.get(key); //taking its value
            if(val > max){
                max = val;
                ans = key;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
