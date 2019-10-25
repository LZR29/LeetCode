package contest157;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author linzerong
 * @create 2019-10-06 10:30
 */
public class Play_with_Chips {
    public int minCostToMoveChips(int[] chips) {
        int ans = 0;
        Arrays.sort(chips);
        for (int i = 0; i < chips.length; i++) {
            if(chips[i] % 2 == 0){
                ans++;
            }
        }
        ans = Math.min(chips.length-ans, ans);
        return ans;
    }
}
