package medium;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author linzerong
 * @create 2019-09-14 14:11
 */
public class No253 {
    public int minMeetingRooms(int[][] intervals) {
        if(intervals.length == 0){
            return 0;
        }
        PriorityQueue<Integer> heap = new PriorityQueue<>((o1, o2) -> o1 - o2);
        Arrays.sort(intervals, (o1, o2) -> o1[0] - o2[0]);
        heap.add(intervals[0][1]);
        for (int i = 1; i < intervals.length; i++) {
            if(intervals[i][0] >= heap.peek()){
                heap.poll();
            }
            heap.add(intervals[i][1]);
        }
        return heap.size();
    }
}
