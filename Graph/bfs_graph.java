package Graph;
import java.util.*;
public class bfs_graph {
    HashMap<Integer , List<Integer>> map = new HashMap<>(); 
    public void bfs(HashMap<Integer , List<Integer>> map , int source , HashSet<Integer> visited, List<Integer> result){
        Queue<Integer> q = new LinkedList<>();
        q.offer(source);
        visited.add(source);
        
        while(!q.isEmpty()){
            int curr = q.poll();
            result.add(curr);
            for(int neighbor : map.get(curr)){
                if(!visited.contains(neighbor)){
                    visited.add(neighbor);
                    q.offer(neighbor);
                }
                
            }
        }
    }
    public static void main(String[] args) {
        bfs_graph graph = new bfs_graph();
        graph.map.put(0, Arrays.asList(1, 2));
        graph.map.put(1, Arrays.asList(0, 3, 4));
        graph.map.put(2, Arrays.asList(0));
        graph.map.put(3, Arrays.asList(1));
        graph.map.put(4, Arrays.asList(1));
        HashSet<Integer> visited = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        graph.bfs(graph.map, 0, visited, result);
        System.out.println(result);
    }
}
