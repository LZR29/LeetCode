package interview;

import java.util.HashMap;
import java.util.Map;

/**
 * @author linzerong
 * @create 2019-03-03 20:27
 */
public class Gas_Station {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int len = gas.length;
        int start = -1;
        int sum = 0;
        for (int i = 0; i < len; i++) {
            if(gas[i] >= cost[i]){
                start = i;
                sum += gas[i] - cost[i];
                int j = 0;
                for (j = (start + 1) % len; j != start; j = (j+1) % len) {
                    sum += gas[j] - cost[j];
                    if(sum < 0){
                        sum = 0;
                        break;
                    }
                }
                if(j == start){
                    return start;
                }
            }else {
                continue;
            }
        }
        return -1;
    }
}
