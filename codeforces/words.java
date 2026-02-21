import java.util.*;
public class words {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int upper = 0 , lower = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c >= 65 && c <= 90){ // Checking if the character is uppercase by using ascii values from A to Z
                upper++;
            }else if(c >= 97 && c <= 122){ // Checking if the character is lowercase by using ascii values from a to z
                lower++;
            }
        }
        if(upper > lower){
            System.out.println(s.toUpperCase());
        }else{
            System.out.println(s.toLowerCase());
        }
    }
}
