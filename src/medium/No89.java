package medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @author linzerong
 * @create 2019-08-28 15:53
 */
public class No89 {

    public List<Integer> grayCode(int n) {
        //性质：https://zh.wikipedia.org/wiki/%E6%A0%BC%E9%9B%B7%E7%A0%81#%E9%8F%A1%E5%B0%84%E6%8E%92%E5%88%97
        //使用了镜射排列的性质
        List<Integer> list = new ArrayList<>(n*n);
        int more = 1;
        list.add(0);
        for (int i = 0; i < n; i++) {
            for (int j = list.size()-1; j >= 0; j--) {
                list.add(more + list.get(j));
            }
            more <<= 1;
        }
        return list;
    }
}
