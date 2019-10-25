package medium;

import java.util.*;

/**
 * @author linzerong
 * @create 2019-09-13 9:31
 */
public class No399 {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        Map<String, Map<String, Double>> map = new HashMap<>();
        Map<String, Boolean> visited = new HashMap<>();
        //构造图
        for(int i = 0; i < equations.size(); i++){
            List<String> list = equations.get(i);
            String a = list.get(0);
            String b = list.get(1);
            visited.putIfAbsent(a, false);
            visited.putIfAbsent(b, false);
            if(map.containsKey(a)){
                map.get(a).put(b, values[i]);
            }else {
                Map<String, Double> edge = new HashMap<>();
                edge.put(a, (double) 1);
                edge.put(b, values[i]);
                map.put(a, edge);
            }
            if(map.containsKey(b)){
                map.get(b).put(a, 1/values[i]);
            }else {
                Map<String, Double> edge = new HashMap<>();
                edge.put(b, (double) 1);
                edge.put(a, 1/values[i]);
                map.put(b, edge);
            }
        }
        int len = queries.size();
        double[] ans = new double[len];
        for (int i = 0; i < len; i++) {
            List<String> list = queries.get(i);
            String a = list.get(0);
            String b = list.get(1);
            if(map.containsKey(a) && map.containsKey(b)){
                ans[i] = -1.0;
                dfs(map, visited, a, b, i, ans, new ArrayList<Double>());
            }else {
                ans[i] = -1.0;
            }
        }
        return ans;
    }

    public void dfs(Map<String, Map<String, Double>> map, Map<String, Boolean> visited, String a, String b, int index, double[] ans, List<Double> list){
        visited.put(a, true);
        if(visited.get(b)){
            ans[index] = 1;
            for(double d : list){
                ans[index] *= d;
            }
        }else {
            Map<String, Double> edge = map.get(a);
            for(Map.Entry<String, Double> entry : edge.entrySet()){
                String key = entry.getKey();
                double num = entry.getValue();
                if(!visited.get(key)) {
                    list.add(num);
                    dfs(map, visited, key, b, index, ans, list);
                    list.remove(list.size() - 1);
                }
            }
        }
        visited.put(a, false);
    }
}
