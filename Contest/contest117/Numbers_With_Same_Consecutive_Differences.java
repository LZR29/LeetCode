package contest117;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @authoor linzerong
 * @create 2018-12-30 10:39
 */
public class Numbers_With_Same_Consecutive_Differences {
    public static int[] numsSameConsecDiff(int N, int K) {
        if(N == 1){
            return new int[]{0,1,2,3,4,5,6,7,8,9};
        }
        List<Integer> list = new ArrayList<>();
        int[][] nums = new int[N][10];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 10; j++) {
                nums[i][j] = j;
            }
        }
        for (int i = 1; i <= 9; i++) {
            helper(nums,i,1,N,K,i,list);
        }
        int[] ans = new int[list.size()];
        int i = 0;
        for(int c : list){
            ans[i++] = c;
        }
        return ans;
    }
    static void  helper(int[][] nums, int preNum, int i, int N, int K,int sum, List<Integer> list){
        if(i == N){
            list.add(sum);
            return;
        }else {
            sum *= 10;
            for (int j = 0; j < 10; j++) {
                if(Math.abs(preNum - nums[i][j]) == K){
                    int pre = preNum - nums[i][j] > 0 ? preNum - K : preNum + K;
                    if(pre >= 0 && pre < 10) {
                        helper(nums, pre, i + 1, N, K, sum+pre, list);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(numsSameConsecDiff(1,1)));
    }
}
