package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @authoor linzerong
 * @create 2019-01-27 10:36
 */
public class No984 {
    public String strWithout3a3b(int A, int B) {
        StringBuilder sb = new StringBuilder();
        if(A > B){
            for (int i = 0; i < A; i++) {
                sb.append('a');
            }
            int index = 0;
            while( (index = sb.indexOf("aaa")) != -1){
                sb.insert(index + 2,'b');
                B--;
            }
            while(B > 0){
                index = sb.indexOf("aba");
                sb.insert(index+1,'b');
                B--;
            }
        }else if(A < B){
            for (int i = 0; i < B; i++) {
                sb.append('b');
            }
            int index = 0;
            while( (index = sb.indexOf("bbb")) != -1){
                sb.insert(index + 2,'a');
                A--;
            }
            while(A > 0){
                index = sb.indexOf("bab");
                sb.insert(index+1,'a');
                A--;
            }
        }else {
            for (int i = 0; i < A; i++) {
                sb.append('a');
                sb.append('b');
            }
        }
        return sb.toString();
    }
}
