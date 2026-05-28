package Graph;
import java.util.*;

public class dfs_graph {
    HashMap<Integer, List<Integer>> map = new HashMap<>();
    public void dfs(HashMap<Integer, List<Integer>> map, int source, HashSet<Integer> visited, List<Integer> result) {
        if(visited.contains(source)) return;
        visited.add(source);
        result.add(source);
        for(int n : map.get(source)){
            dfs(map , n , visited, result);
        }
    }
    public static void main(String[] args) {
        dfs_graph graph = new dfs_graph();
        graph.map.put(0, Arrays.asList(1, 2));
        graph.map.put(1, Arrays.asList(0, 3, 4));
        graph.map.put(2, Arrays.asList(0));
        graph.map.put(3, Arrays.asList(1));
        graph.map.put(4, Arrays.asList(1));
        HashSet<Integer> visited = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        graph.dfs(graph.map, 0, visited, result);
        System.out.println(result);
    }
}
