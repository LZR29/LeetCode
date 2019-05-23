package medium;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author linzerong
 * @create 2018-12-13 15:49
 */
public class No406 {

    public static int[][] reconstructQueue(int[][] people) {
        if(people.length == 0){
            return new int[0][0];
        }
        int len = people.length;
        int[][] ans = new int[len][2];
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0]){
                    return o1[1] - o2[1];
                }
                return o2[0] - o1[0];
            }
        });
        List<int[]> res = new LinkedList<>();
        for (int i = 0; i < len; i++) {
            res.add(people[i][1],people[i]);
        }
        for (int i = 0; i < len; i++) {
            ans[i] = res.get(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] people = {{7,0}, {4,4}, {7,1}, {5,0}, {6,1}, {5,2}};
        reconstructQueue(people);
    }
}
