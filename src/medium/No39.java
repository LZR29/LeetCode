package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author linzerong
 * @create 2019-08-15 15:04
 */
public class No39 {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int sum = 0;
        List<Integer> list = new ArrayList<>();
        addElement(candidates, list, sum, target,0);
        return res;

    }

    private void addElement(int[] candidates, List<Integer> list, int sum, int target,int index) {
        if (sum > target) {
            return;
        }
        if (sum == target) {
            res.add(list);
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            List<Integer> t_list = new ArrayList<>(list);
            t_list.add(candidates[i]);
            addElement(candidates, t_list, sum + candidates[i], target,i);
        }

    }
}
