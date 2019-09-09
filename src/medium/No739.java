package medium;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @author linzerong
 * @create 2019-08-22 22:31
 */
public class No739 {

    public int[] dailyTemperatures(int[] T) {
        //逆序遍历，使用单调栈，很有用的方法
        int len = T.length;
        int[] ans = new int[len];
        LinkedList<Integer> stack = new LinkedList<>();
        for (int i = len-1; i >= 0; i--) {
            //构造一个从顶到底非递增的栈
            while(!stack.isEmpty() && T[i] >= T[stack.peek()]){
                stack.pop();
            }
            ans[i] = stack.isEmpty() ? 0 : stack.peek()-i;
            stack.push(i);
        }
        return ans;
    }
}
