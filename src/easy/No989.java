package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author linzerong
 * @create 2019-02-10 10:40
 */
public class No989 {
    public List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> ans = new ArrayList<>();
        while(K != 0){
            ans.add(0,K % 10);
            K /= 10;
        }
        if(ans.size() > A.length){
            int lens = A.length - 1;
            int lenl = ans.size() - 1;
            int more = 0;
            int[] nums = new int[lenl + 2];
            while(lens >= 0){
                nums[lenl + 1] = A[lens] + ans.get(lenl) + more;
                more = nums[lenl + 1] / 10;
                nums[lenl + 1] %= 10;
                lenl--;
                lens--;
            }
            while(lenl >= 0){
                nums[lenl + 1] = ans.get(lenl) + more;
                more = nums[lenl + 1] / 10;
                nums[lenl + 1] %= 10;
                lenl--;
            }
            nums[0] = more;
            List<Integer> numsl = new ArrayList<Integer>();
            for (int i = 0; i < nums.length; i++) {
                if(i == 0 && nums[i] == 0){
                    continue;
                }
                numsl.add(nums[i]);
            }
            return numsl;
        }else {
            int lens = ans.size() - 1;
            int lenl = A.length - 1;
            int more = 0;
            int[] nums = new int[lenl + 2];
            while(lens >= 0){
                nums[lenl + 1] = A[lenl] + ans.get(lens) + more;
                more = nums[lenl + 1] / 10;
                nums[lenl + 1] %= 10;
                lenl--;
                lens--;
            }
            while(lenl >= 0){
                nums[lenl + 1] = A[lenl] + more;
                more = nums[lenl + 1] / 10;
                nums[lenl + 1] %= 10;
                lenl--;
            }
            nums[0] = more;
            List<Integer> numsl = new ArrayList<Integer>();
            for (int i = 0; i < nums.length; i++) {
                if(i == 0 && nums[i] == 0){
                    continue;
                }
                numsl.add(nums[i]);
            }
            return numsl;
        }

    }
}
