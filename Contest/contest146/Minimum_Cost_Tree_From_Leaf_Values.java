package contest146;

import java.util.Stack;

/**
 * @author linzerong
 * @create 2019-07-21 10:54
 */
public class Minimum_Cost_Tree_From_Leaf_Values {
    /**
     * 参考lee哥的，可以看YouTube视频
     * @param arr
     * @return
     */
    public int mctFromLeafValues(int[] arr) {
        Stack<Integer> s = new Stack<>();
        s.push(16);
        int ans = 0;
        for(int i : arr){
            while (s.peek() <= i){
                int mid = s.pop();
                ans += mid * Math.min(i, s.peek());
            }
            s.push(i);
        }
        while (s.size() > 2) {
            ans += s.pop() * s.peek();
        }
        return ans;
    }
}
