package contest116;

/**
 * @author linzerong
 * @create 2018-12-23 10:43
 */
public class Maximum_Width_Ramp {
    public int maxWidthRamp(int[] A) {
        int len = A.length;
        int max = 0;
        for (int i = 1; i < len; i++) {
            for (int j = 0; j < i; j++) {
                if(A[j] <= A[i]){
                    max = Math.max(i - j, max);
                    break;
                }
            }
        }
        return max;
    }
}
