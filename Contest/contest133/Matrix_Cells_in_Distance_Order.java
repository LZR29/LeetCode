package contest133;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author linzerong
 * @create 2019-04-21 14:41
 */
public class Matrix_Cells_in_Distance_Order {
    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        int[][] node = new int[R * C][2];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                int index = i * C + j;
                node[index][0] = i;
                node[index][1] = j;
            }
        }
        Arrays.sort(node, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                int d1 = Math.abs(o1[0] - r0) + Math.abs(o1[1]-c0);
                int d2 = Math.abs(o2[0] - r0) + Math.abs(o2[1]-c0);
                return d1 - d2;
            }
        });
        return node;
    }
}
