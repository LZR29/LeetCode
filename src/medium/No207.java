package medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author linzerong
 * @create 2019-09-13 10:50
 */
public class No207 {
    ArrayList<Integer>[] map;
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        map = new ArrayList[numCourses];
        int[] course = new int[numCourses];
        Queue<Integer> queue = new LinkedList<>();
        int count = 0;
        for (int i = 0; i < numCourses; i++) {
            map[i] = new ArrayList<>();
        }
        for (int i = 0; i < prerequisites.length; i++) {
            course[prerequisites[i][1]]++;
            map[prerequisites[i][0]].add(prerequisites[i][1]);
        }
        for (int i = 0; i < numCourses; i++) {
            if(course[i] == 0){
                queue.add(i);
                count++;
            }
        }
        while (!queue.isEmpty()){
            int pre = queue.poll();
            for(int i : map[pre]){
                course[i]--;
                if(course[i] == 0){
                    count++;
                    queue.add(i);
                }
            }
        }
        return count == numCourses;
    }
}
