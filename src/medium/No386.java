package medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @author linzerong
 * @create 2019-09-16 13:44
 */
public class No386 {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            if(i <= n){
                ans.add(i);
                add(ans, i, n);
            }else {
                break;
            }
        }
        return ans;
    }
    public void add(List<Integer> list ,int start, int n){
        start *= 10;
        for (int i = 0; i < 10; i++, start++) {
            if(start <= n){
                list.add(start);
                add(list, start, n);
            }else {
                break;
            }
        }
    }
}
