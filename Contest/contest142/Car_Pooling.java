package contest142;

import java.util.*;

/**
 * @author linzerong
 * @create 2019-06-23 10:56
 */
public class Car_Pooling {
    public boolean carPooling(int[][] trips, int capacity) {
        Arrays.sort(trips,new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] == o2[1]){
                    return o1[2] - o2[2];
                }
                return o1[1] - o2[1];
            }
        });
        System.out.println(Arrays.deepToString(trips));
        PriorityQueue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[2] - o2[2];
            }
        });
        for (int i = 0; i < trips.length; i++) {
            while (!queue.isEmpty()){
                int[] cur = queue.peek();
                if(cur[2] <= trips[i][1]){
                    capacity += cur[0];
                    queue.poll();
                }else {
                    break;
                }
            }
            queue.add(trips[i]);
            capacity -= trips[i][0];
            if(capacity < 0){
                return false;
            }
        }
        return true;
    }
}
