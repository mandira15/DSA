import java.util.*;
public class mike_feet {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int[] left = new int[n];
        int[] right = new int[n];
        Stack<Integer> st = new Stack<>();
        //finding previous smaller element
        for(int i = 0; i <n; i++){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                left[i] = -1;
            }else{
                left[i] = st.peek();
            }
            st.push(i);
        }
        st.clear();
        //finding next smaller element
        for(int i = n - 1; i >= 0; i--){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }
            if(st.isEmpty()) right[i] = n;
            else right[i] = st.peek();
            st.push(i);
        }
        int ans[] = new int[n + 1];
        for(int i = 0; i < n; i++){
            int len = right[i] - left[i] - 1;
            ans[len] = Math.max(ans[len], arr[i]);
        }
        for(int i = n - 1; i >= 1; i--){
            ans[i] = Math.max(ans[i], ans[i + 1]);
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
