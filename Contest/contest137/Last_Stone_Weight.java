package contest137;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author linzerong
 * @create 2019-05-19 10:30
 */
public class Last_Stone_Weight {
    public int lastStoneWeight(int[] stones) {
        List<Integer> list = new ArrayList<>(stones.length);
        for(int i : stones){
            list.add(i);
        }
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        };
        list.sort(comparator);
        while (list.size() > 1){
            int x = list.remove(0);
            int y = list.remove(0);
            if(x == y){
                continue;
            }else if(x > y){
                list.add(x-y);
                list.sort(comparator);
            }
        }
        if(list.size() == 1){
            return list.get(0);
        }
        return 0;
    }
}
