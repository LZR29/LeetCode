package easy;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @authoor linzerong
 * @create 2019-01-17 9:24
 */
public class No973 {
    public int[][] kClosest(int[][] points, int K) {
        int[][] res = new int[K][];
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return (o1[0]*o1[0] + o1[1]*o1[1]) - (o2[0]*o2[0] + o2[1]*o2[1]);
            }
        });
        for (int i = 0; i < K; i++) {
            res[i] = points[i];
        }
        return res;
    }
}
