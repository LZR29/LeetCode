package medium;

import java.util.*;

/**
 * @author linzerong
 * @create 2019-08-09 20:13
 */
public class No939 {

    public int minAreaRect(int[][] points) {
        Map<Integer, List<Integer>> rows = new TreeMap<>();
        for(int[] p : points){
            if(rows.containsKey(p[0])){
                rows.get(p[0]).add(p[1]);
            }else {
                List<Integer> list = new ArrayList<>();
                list.add(p[1]);
                rows.put(p[0], list);
            }
        }
        Map<Integer, Integer> map = new HashMap<>();
        int ans = Integer.MAX_VALUE;
        for(int k : rows.keySet()){
            List<Integer> list = rows.get(k);
            Collections.sort(list);
            for (int i = 0; i < list.size(); i++) {
                for (int j = i+1; j < list.size(); j++) {
                    int y1 = list.get(i);
                    int y2 = list.get(j);
                    int s = 40001 * y1 + y2;
                    if(map.containsKey(s)){
                        ans = Math.min(ans, (k-map.get(s))*(y2-y1));
                    }
                    map.put(s, k);
                }
            }
        }
        return ans < Integer.MAX_VALUE ? ans : 0;
    }

}
