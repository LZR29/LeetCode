package contest133;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author linzerong
 * @create 2019-04-21 14:38
 */
public class Two_City_Scheduling {
    public int twoCitySchedCost(int[][] costs) {
        int sum = 0;
        Arrays.sort(costs, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return (o1[0]-o1[1]) - (o2[0] - o2[1]);
            }
        });
        int len = costs.length / 2;
        for (int i = 0; i < len; i++) {
            sum += costs[i][0] + costs[costs.length - 1 - i][1];
        }
        return sum;
    }
}
