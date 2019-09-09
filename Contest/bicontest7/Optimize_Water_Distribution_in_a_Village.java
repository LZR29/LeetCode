package bicontest7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author linzerong
 * @create 2019-08-25 15:36
 */
public class Optimize_Water_Distribution_in_a_Village {
    //并查集
    int[] uf;

    public int find(int x){
        if(uf[x] == x){
            return x;
        }
        return uf[x] = find(uf[x]);
    }
    public int minCostToSupplyWater(int n, int[] wells, int[][] pipes) {
        uf = new int[n+1];
        PriorityQueue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        for (int i = 0; i <= n; i++) {
            uf[i] = i;
        }
        for (int i = 0; i < wells.length; i++) {
            //0到i+1这个代表了生成本身的代价
            queue.add(new int[]{wells[i], 0, i+1});
        }
        for (int i = 0; i < pipes.length; i++) {
            queue.add(new int[] {pipes[i][2], pipes[i][0], pipes[i][1]});
        }
        int ans = 0;
        while (!queue.isEmpty()){
            int[] cur = queue.poll();
            int p = find(cur[1]);
            int q = find(cur[2]);
            if(p == q){
                continue;
            }
            ans += cur[0];
            uf[p] = q;
        }
        System.out.println(Arrays.toString(uf));
        return ans;
    }
}
