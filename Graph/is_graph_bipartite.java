package Graph;
import java.util.*;
public class is_graph_bipartite {
    public boolean dfsGraphBipartite(int[][] graph, int curr, int currColor, int[]color){
        color[curr] = currColor;
        for(int i : graph[curr]){
            if(color[i] == color[curr]){ //in case if the color of two adjacent nodes is same
                return false;
            }
            if(color[i] == -1){
                if(!dfsGraphBipartite(graph, i , 1 - currColor, color)){ //recursively checking for the adjacent nodes
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isBipartite(int[][] graph){
        int n = graph.length;
        int[] color = new int[n]; // to keep tracking color change
        Arrays.fill(color, -1);   // to currently all nodes are -1
        for(int i = 0; i < n; i++){
            if(color[i] == -1){
                if(!dfsGraphBipartite(graph, i, 1, color)){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args){
        int[][] graph = {{1,3},{0,2},{1,3},{0,2}};
        is_graph_bipartite g = new is_graph_bipartite();
        System.out.println(g.isBipartite(graph));
    }
}
