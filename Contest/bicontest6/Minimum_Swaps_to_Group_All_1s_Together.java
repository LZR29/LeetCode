package bicontest6;

/**
 * @author linzerong
 * @create 2019-08-10 22:34
 */
public class Minimum_Swaps_to_Group_All_1s_Together {
    public int minSwaps(int[] data) {
        int count = 0;
        for(int i : data){
            count += i;
        }
        int zero = 0;
        for (int i = 0; i < count; i++) {
            if(data[i] == 0){
                zero++;
            }
        }
        int ans = zero;
        for (int i = count; i < data.length; i++) {
            if(data[i] == 0){
                zero++;
            }
            if(data[i-count] == 0){
                zero--;
            }
            ans = Math.min(ans, zero);
        }
        return ans;
    }
}
