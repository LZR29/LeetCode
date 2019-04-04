package medium;

import java.util.Stack;

/**
 * @authoor linzerong
 * @create 2019-03-23 11:01
 */
public class No150 {
    public static int evalRPN(String[] tokens) {
        Stack<Integer> nums = new Stack<Integer>();
        for (int i = 0; i < tokens.length; i++) {
            if(Character.isDigit(tokens[i].charAt(tokens[i].length()-1))){
                nums.push(Integer.parseInt(tokens[i]));
            }else {
                switch (tokens[i]){
                    case "+" :{
                        int x2 = nums.pop();
                        int x1 = nums.pop();
                        nums.push(x1 + x2);
                    }break;
                    case "-":{
                        int x2 = nums.pop();
                        int x1 = nums.pop();
                        x1 -= x2;
                        nums.push(x1);
                    }break;
                    case "*" :{
                        int x2 = nums.pop();
                        int x1 = nums.pop();
                        nums.push(x1 * x2);
                    }break;
                    case "/":{
                        int x2 = nums.pop();
                        int x1 = nums.pop();
                        nums.push(x1 / x2);
                    }break;
                    default:break;
                }
            }
        }
        return nums.pop();
    }
    public static boolean helper(String s){
        for (int i = 0; i < s.length(); i++) {

        }
        return true;
    }
    public static void main(String[] args) {
        String[] s = {"4", "13", "5", "/", "-"};
        System.out.println(evalRPN(s));
    }
}
