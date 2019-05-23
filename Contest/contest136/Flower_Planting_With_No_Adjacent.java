package contest136;

import java.util.*;

/**
 * @author linzerong
 * @create 2019-05-12 10:56
 */
public class Flower_Planting_With_No_Adjacent {
    public int[] gardenNoAdj(int N, int[][] paths) {
        int[] ans = new int[N];
        Integer[] f = new Integer[]{1,2,3,4};
        List<Integer>[] map = new List[N];
        for (int i = 0; i < N; i++) {
            map[i] = new ArrayList<>();
        }
        for (int i = 0; i < paths.length; i++) {
            map[paths[i][0]-1].add(paths[i][1]-1);
            map[paths[i][1]-1].add(paths[i][0]-1);
        }
        for (int i = 0; i < N; i++) {
            TreeSet<Integer> set = new TreeSet<>(Arrays.asList(f));
            for(int j : map[i]){
                set.remove(ans[j]);
            }
            ans[i] = set.first();
        }
        return ans;
    }
}
