package easy;

import java.util.Stack;

/**
 * @author linzerong
 * @create 2019-08-14 14:13
 */
public class No155 {
    /** initialize your data structure here. */
    Stack<Integer> data = new Stack<>();
    Stack<Integer> min = new Stack<>();

    public No155() {

    }

    public void push(int x) {
        if(data.isEmpty()) {
            data.push(x);
            min.push(x);
        }else {
            data.push(x);
            int top = min.peek();
            if (top > x) {
                top = x;
            }
            min.push(top);
        }
    }

    public void pop() {
        min.pop();
        data.pop();
    }

    public int top() {
        return data.peek();
    }

    public int getMin() {
        return min.peek();
    }
}
