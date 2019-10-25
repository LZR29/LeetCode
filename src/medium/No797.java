package medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @author linzerong
 * @create 2019-09-11 17:54
 */
public class No797 {
    List<List<Integer>> ans = new ArrayList<>();
    int[][] graph;
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        this.graph = graph;
        boolean[] visited = new boolean[graph.length];
        dfs(visited, 0, new ArrayList<>());
        return ans;
    }

    public void dfs(boolean[] visited, int index, List<Integer> path){
        visited[index] = true;
        path.add(index);
        if(index == visited.length-1){
            ans.add(new ArrayList<>(path));
        }else {
            for(int next : graph[index]){
                if(!visited[next]) {
                    dfs(visited, next, path);
                }
            }
        }
        visited[index] = false;
        path.remove(path.size()-1);
    }
}
