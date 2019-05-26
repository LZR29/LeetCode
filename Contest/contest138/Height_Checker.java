package contest138;

import java.util.Arrays;

/**
 * @author linzerong
 * @create 2019-05-26 12:07
 */
public class Height_Checker {
    public int heightChecker(int[] heights) {
        int[] res = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            res[i] = heights[i];
        }
        Arrays.sort(res);
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if(res[i] != heights[i]){
                count++;
            }
        }
        return count;
    }
}
