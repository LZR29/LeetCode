package contest143;

import java.util.Stack;

/**
 * @author linzerong
 * @create 2019-06-30 11:04
 */
public class Parsing_A_Boolean_Expression {
    public boolean parseBoolExpr(String expression) {
        Stack<Character> flag = new Stack<>();
        Stack<Character> res = new Stack<>();
        for(int i = 0; i < expression.length(); i++){
            char c = expression.charAt(i);
            if(c == '!' || c == '&' || c == '|'){
                flag.push(c);
            }else if(c == ')') {
                char result = 't';
                char f = flag.pop();
                if(f == '!'){
                    if(res.pop() == 't'){
                        result = 'f';
                    }else {
                        result = 't';
                    }
                    res.pop();
                    res.push(result);
                }else if(f == '&'){
                    char temp = res.pop();
                    while (temp != '('){
                        if(temp == 'f'){
                            result = 'f';
                        }
                        temp = res.pop();
                    }
                    res.push(result);
                }else {
                    char temp = res.pop();
                    result = 'f';
                    while (temp != '('){
                        if(temp == 't'){
                            result = 't';
                        }
                        temp = res.pop();
                    }
                    res.push(result);
                }
            }else if(c == ','){
                continue;
            }else {
                res.push(c);
            }
        }
        System.out.println(res.size());
        return res.pop() == 't' ? true : false;
    }
}
