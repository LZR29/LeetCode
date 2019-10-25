package medium;

import java.util.Stack;

/**
 * @author linzerong
 * @create 2019-09-13 10:59
 */
public class No394 {
    public String decodeString(String s) {
        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();
        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();
        for (int i = 0; i < chars.length;) {
            if(Character.isDigit(chars[i])){
                int count = 0;
                while (Character.isDigit(chars[i])){
                    count = count * 10 + chars[i] - '0';
                    i++;
                }
                countStack.push(count);
            }else if(chars[i] == '['){
                stringStack.push(sb.toString());
                sb.delete(0, sb.length());
                i++;
            }else if(chars[i] == ']'){
                int count = countStack.pop();
                String string = stringStack.pop();
                StringBuilder temp = new StringBuilder(string);
                for (int j = 0; j < count; j++) {
                    temp.append(sb);
                }
                sb = temp;
                i++;
            }else {
                sb.append(chars[i]);
                i++;
            }
        }
        return sb.toString();
    }
}
