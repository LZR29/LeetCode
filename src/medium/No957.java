package medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author linzerong
 * @create 2018-12-17 19:34
 */
public class No957 {
    public static int[] prisonAfterNDays(int[] cells, int N) {
        Map<String,Integer> map = new HashMap<>();
        N = N % 14;
        while (N > 0){
           int[] cells2 = new int[8];
            map.put(Arrays.toString(cells),N);
            N--;
            for (int i = 1; i < 7; i++) {
                cells2[i] = cells[i - 1] == cells[i + 1] ? 1 : 0;
            }
            cells = cells2;
            if(map.containsKey(Arrays.toString(cells))){
                N = N % (map.get(Arrays.toString(cells)) - N);
            }
        }
    //    System.out.println(Arrays.toString(cells));
        return cells;
    }

    public static void main(String[] args) {
        int[] cells = {0,1,0,1,1,0,0,1};
        prisonAfterNDays(cells,1000000000);
    //    System.out.println(Arrays.toString(cells));
    }
}
