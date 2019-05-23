package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author linzerong
 * @create 2019-01-02 18:27
 */
public class No821 {
    public int[] shortestToChar(String S, char C) {
        int len = S.length();
        int[] ans = new int[len];
        List<Integer> pos = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            ans[i] = len;
            if(C == S.charAt(i)){
                pos.add(i);
            }
        }
        for (int i = 0; i < len; i++) {
            if(S.charAt(i) == C){
                ans[i] = 0;
            }else {
                for(int j : pos){
                    ans[i] = Math.min(Math.abs(i - j),ans[i]);
                }
            }
        }
        return ans;
    }
}
