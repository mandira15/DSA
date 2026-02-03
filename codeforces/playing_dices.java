import java.util.*;
public class playing_dices {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = 0, m = 0, draw = 0;
        for(int i = 1; i <= 6; i++){
            if(Math.abs(i - a) < Math.abs(i - b)){
                n++;
            }else if(Math.abs(i - a) == Math.abs(i - b)){
                draw++;
            }else{
                m++;
            }
        }
        System.out.println(n + " " +draw +" "+ m);
    }
}
