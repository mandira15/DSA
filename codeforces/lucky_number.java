import java.util.*;

public class lucky_number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        String s = String.valueOf(n); //converted long into string
        int count = 0;
        for(char c : s.toCharArray()){
            if(c == '4' || c == '7'){
                count++;
            }
        }
        if(count == 4 || count == 7){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
