package hard;

import java.util.Stack;

/**
 * @author linzerong
 * @create 2019-09-13 15:29
 */
public class No42 {
    public int trap(int[] height) {
        int ans = 0;
        Stack<Integer> stack = new Stack<>();
        int cur = 0;
        int len = height.length;
        while (cur < len){
            //栈里面存的是从底到顶非递增的
            //栈顶小于当前指针的数，说明可以存水
            while (!stack.isEmpty() && height[cur] > height[stack.peek()]){
                int h = height[stack.pop()];
                if(stack.isEmpty()){
                    break;
                }
                //距离
                int distance = cur - stack.peek() - 1;
                int min = Math.min(height[stack.peek()], height[cur]);
                ans += distance * (min - h);
            }
            stack.push(cur);
            cur++;
        }
        return ans;
    }
}
