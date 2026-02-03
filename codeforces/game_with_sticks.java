import java.util.Scanner;
public class game_with_sticks {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int d = Math.min(n,m);
        if((d) % 2 == 0 ){
            System.out.println("Malvika");
        }else{
            System.out.println("Akshat");
        }
    }
}
