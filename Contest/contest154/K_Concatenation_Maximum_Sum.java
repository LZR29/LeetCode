package contest154;

/**
 * @author linzerong
 * @create 2019-09-15 12:53
 */
public class K_Concatenation_Maximum_Sum {
    public int kConcatenationMaxSum(int[] arr, int k) {
        long sum = 0;
        for(int i : arr){
            sum += i;
        }
        long ans = 0;
        int len = arr.length;
        if(sum > 0 && k >= 2){
            int pre = 0;
            int suf = 0;
            int temp = 0;
            for(int i : arr){
                temp += i;
                pre = Math.max(pre, temp);
            }
            temp = 0;
            for(int i = len - 1; i >= 0; i--){
                temp += arr[i];
                suf = Math.max(temp, suf);
            }
            ans = Math.max(ans, pre + suf + (k-2) * sum);
        }
        if(k >= 2){
            int temp = 0;
            for (int i = 0; i < 2; i++) {
                for(int j : arr){
                    if(temp > 0){
                        temp += j;
                        temp %= 1000000007;
                    }else {
                        temp = j;
                    }
                    ans = Math.max(ans, temp);
                }
            }
        }
        if(k <= 1){
            int temp = 0;
            for(int j : arr){
                if(temp > 0){
                    temp += j;
                    temp %= 1000000007;
                }else {
                    temp = j;
                }
                ans = Math.max(ans, temp);
            }
        }
        return (int) (ans % 1000000007);
    }
}
