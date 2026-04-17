public class floodFill {
    
    void dfs(int[][] image, int i , int j , int newColor , int orgCol){
        //base case
        if(i < 0 ||j < 0||i >= image.length || j >= image[0].length || image[i][j] == newColor || image[i][j] != orgCol){
            return;
        }
        image[i][j] = newColor;
        dfs(image , i - 1, j , newColor, orgCol);
        dfs(image, i + 1, j , newColor, orgCol);
        dfs(image, i, j - 1, newColor, orgCol);
        dfs(image, i , j + 1, newColor, orgCol);

    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        dfs(image, sr , sc , color , image[sr][sc]);
        return image;
    }
    public static void main(String[] args) {
        floodFill ff = new floodFill();
        int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
        int sr = 1;
        int sc = 1;
        int color = 2;
        int[][] ans = ff.floodFill(image, sr, sc, color);
        for(int i = 0; i < ans.length; i++){
            for(int j = 0; j < ans[0].length; j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}

