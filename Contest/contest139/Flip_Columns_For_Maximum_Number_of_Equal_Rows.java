package contest139;

import java.util.HashMap;
import java.util.Map;

/**借鉴别人的代码，很不一样的思路
 * @author linzerong
 * @create 2019-06-02 10:53
 */
public class Flip_Columns_For_Maximum_Number_of_Equal_Rows {
    public int maxEqualRowsAfterFlips(int[][] matrix) {
        Map<String, Integer> map = new HashMap<>();
        for(int[] row : matrix){
            StringBuilder sb1 = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            for(int i : row){
                sb1.append(i);
                sb2.append(1-i);
            }
            String s1 = sb1.toString();
            String s2 = sb2.toString();
            map.put(s1, map.getOrDefault(s1,0)+1);
            map.put(s2, map.getOrDefault(s2,0)+1);
        }
        int res = 0;
        for(int i : map.values()){
            res = Math.max(res,i);
        }
        return res;
    }
}
