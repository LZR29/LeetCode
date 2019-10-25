package contest154;

import java.util.Stack;

/**
 * @author linzerong
 * @create 2019-09-15 10:40
 */
public class Reverse_Substrings_Between_Each_Pair_of_Parentheses {
    public String reverseParentheses(String s) {
        char[] chars = s.toCharArray();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == '('){
                stack.push(i);
            }else if(chars[i] == ')'){
                int start = stack.pop();
                helper(chars, start, i);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] != ')' && chars[i] != '('){
                sb.append(chars[i]);
            }
        }
        return sb.toString();
    }
    public void helper(char[] chars, int start, int end){
        while (start <= end){
            if(chars[start] == '(' || chars[start] == ')') {
                start++;
                continue;
            }
            if(chars[end] == ')' || chars[end] == '('){
                end--;
                continue;
            }
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
    }
}
