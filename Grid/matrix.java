import java.util.*;
public class matrix {
    int[][] directions = {{-1,0} ,{1,0} , {0, -1}, {0 , 1}};
    public int[][] updateMat(int[][] mat){
        int m = mat.length;
        int n = mat[0].length;
        int[][] res = new int[m][n];
        Queue<int[]> que = new LinkedList<>();
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(mat[i][j] == 0){
                    res[i][j] = 0;
                    que.offer(new int[]{i, j});
                }else{
                    res[i][j] = -1;
                }
            }
        }
        while(!que.isEmpty()){
            int []cell = que.poll();
            int i = cell[0];
            int j = cell[1];
            for(int[] dir : directions){
                int new_i = i + dir[0];
                int new_j = j + dir[1];
                if(new_i >= 0 && new_j >= 0 && new_i < m && new_j < n && res[new_i][new_j] == -1){
                    res[new_i][new_j] = res[i][j] + 1;
                    que.add(new int[]{new_i , new_j});
                }
            }
        }
        return res;
    }
    public static void main(String[] args){
        matrix m = new matrix();
        int[][] mat = {
            {0, 0, 0},
            {0, 1, 0},
            {1, 1, 1}
        };
        int [][]res = m.updateMat(mat);
        for(int i = 0; i < res.length; i++){
            for(int j = 0; j < res[0].length; j++){
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
