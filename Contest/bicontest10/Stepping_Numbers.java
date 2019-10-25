package bicontest10;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * @author linzerong
 * @create 2019-10-05 22:41
 */
public class Stepping_Numbers {

    public List<Integer> countSteppingNumbers(int A, int B) {
        ArrayList<Integer> res = new ArrayList<>();
        if (A > B) {
            return res;
        }

        Queue<Long> q = new ArrayDeque<>();
        for (long i = 1; i <= 9; i++) {
            q.add(i);
        }

        if (A == 0) {
            res.add(0);
        }
        while (!q.isEmpty()) {
            long p = q.poll();
            if (p < B) {
                long last = p % 10;
                if (last > 0) {
                    q.add(p * 10 + last - 1);
                }
                if (last < 9) {
                    q.add(p * 10 + last + 1);
                }
            }
            if (p >= A && p <= B) {
                res.add((int) p);
            }
        }
        return res;
    }
}
