package easy;

/**
 * @author linzerong
 * @create 2019-09-02 11:58
 */
public class No1176 {
    public int dietPlanPerformance(int[] calories, int k, int lower, int upper) {
        int len = calories.length;
        int[] sum = new int[len+1];
        for (int i = 0; i < len; i++) {
            sum[i+1] = sum[i] + calories[i];
        }
        int point = 0;
        for (int i = 0; i+k <= len; i++) {
            int cur = sum[i+k] - sum[i];
            if(cur < lower){
                point--;
            }else if(cur > upper){
                point++;
            }
        }
        return point;
    }
}
