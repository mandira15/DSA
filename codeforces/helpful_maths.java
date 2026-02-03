import java.util.*;
public class helpful_maths {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] parts = s.split("\\+"); //splitting by +
        //converting into integer array
        int arr[] = new int[parts.length];
        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(parts[i]);
        }
        Arrays.sort(arr);
        //building the desired result
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < arr.length; i++){
            result.append(arr[i]);
            if(i != arr.length - 1){
                result.append("+");
            }
        }
        System.out.println(result.toString());
    }
}
