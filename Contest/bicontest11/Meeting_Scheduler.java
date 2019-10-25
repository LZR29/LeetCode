package bicontest11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author linzerong
 * @create 2019-10-20 10:39
 */
public class Meeting_Scheduler {
    public List<Integer> minAvailableDuration(int[][] slots1, int[][] slots2, int duration) {
        Arrays.sort(slots1, (o1, o2) -> o1[0] - o2[0]);
        Arrays.sort(slots2, (o1, o2) -> o1[0] - o2[0]);
        int i = 0;
        int j = 0;
        int len1 = slots1.length;
        int len2 = slots2.length;
        while (i < len1 && j < len2){
            if(slots1[i][0] < slots2[j][0]){
                if(slots1[i][1] >= slots2[j][0] + duration &&
                        slots2[j][1] >= slots2[j][0] + duration){
                    return Arrays.asList(slots2[j][0], slots2[j][0]+duration);
                }
                i++;
            }else {
                if(slots2[j][1] >= slots1[i][0] + duration &&
                        slots1[i][1] >= slots1[i][0] +duration){
                    return Arrays.asList(slots1[i][0], slots1[i][0]+duration);
                }
                j++;
            }
        }
        return new ArrayList<>();
    }
}
