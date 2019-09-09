package contest146;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author linzerong
 * @create 2019-07-21 10:32
 */
public class Number_of_Equivalent_Domino_Pairs {

    public int numEquivDominoPairs(int[][] dominoes) {
        Map<String, Integer> map = new HashMap<>();
        int n = dominoes.length;
        for (int i = 0; i < n; i++) {
            if(dominoes[i][0] > dominoes[i][1]) {
                int t = dominoes[i][0];
                dominoes[i][0] = dominoes[i][1];
                dominoes[i][1] = t;
            }
            String key = Arrays.toString(dominoes[i]);
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        System.out.println(map.toString());
        int sum = 0;
        for (int i : map.values()){
            sum += i * (i - 1) / 2;
        }
        return sum;
    }

}
