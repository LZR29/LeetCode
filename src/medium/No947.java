package medium;

import java.util.HashMap;
import java.util.Map;

/**
 * @author linzerong
 * @create 2019-03-02 16:31
 */
public class No947 {
    int count = 0;
    public int removeStones(int[][] stones) {
        count = stones.length;
        Map<String,String> root = new HashMap<>();
        for (int i = 0; i < stones.length; i++) {
            String s = stones[i][0] + " " + stones[i][1];
            root.put(s,s);
        }
        for (int i = 0; i < stones.length; i++) {
            for (int j = i + 1; j < stones.length; j++) {
                if(stones[i][0] == stones[j][0] || stones[i][1] == stones[j][1]){
                    String s1 = stones[i][0] + " " + stones[i][1];
                    String s2 = stones[j][0] + " " + stones[j][1];
                    union(root,s1,s2);
                }
            }
        }
        return stones.length - count;
    }
    public String find(Map root, String s){
        while (!s.equals(root.get(s))){
            s = (String) root.get(s);
        }
        return s;
    }
    public void union(Map root, String s1, String s2){
        String r1 = find(root,s1);
        String r2 = find(root,s2);
        if(r1.equals(r2)){
            return;
        }
        count--;
        root.put(r1,r2);
    }
}
