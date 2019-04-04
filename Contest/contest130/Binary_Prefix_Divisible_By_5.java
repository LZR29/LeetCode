package contest130;

import javafx.beans.binding.StringBinding;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * @authoor linzerong
 * @create 2019-03-31 10:30
 */
public class Binary_Prefix_Divisible_By_5 {
    public List<Boolean> prefixesDivBy5(int[] A) {
        List<Boolean> ans = new ArrayList<>();
        int pre = A[0] == 0 ? 0 : 1;
        int cur = A[0];
        if(A[0] == 1){
            ans.add(false);
        }else {
            ans.add(true);
        }
        for (int i = 1; i < A.length; i++) {
            cur = cur << 1;
            cur += A[i];
            if(cur % 5 == 0){
                ans.add(true);
            }else {
                ans.add(false);
            }
            cur %= 5;
        }
        return ans;
    }

    public static void main(String[] args) {
        String i = Integer.toString(4,2);
        System.out.println(i);
    }
}
