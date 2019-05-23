package contest113;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author linzerong
 * @create 2018-12-02 10:31
 */
public class Largest_Time_for_Given_Digits {

    public static String largestTimeFromDigits(int[] A) {
        List<Integer> nums = new ArrayList<>(4);
        for(int i : A){
            nums.add(i);
        }
        int[] times = new int[4];
        for(int i = 86340; i >= 0; i = i -60){
            int time = i / 60;
            int m = time % 60;
            int h = time / 60;
            times[0] = h / 10;
            times[1] = h % 10;
            times[2] = m / 10;
            times[3] = m % 10;
            if(judge(nums,times)){
                return ""+times[0]+times[1]+":"+times[2]+times[3];
            }
        }
        return "";
    }

    public static boolean judge (List<Integer> nums,int[] times){
       List<Integer> nums2 = new ArrayList<>(nums);
        for(int i = 0; i < 4; i++){
            if(nums2.contains(times[i])){
                nums2.remove(((Integer) times[i]));
            }
        }
        return nums2.isEmpty();
    }

    public static void main(String[] args) {
        int[] A = {1,2,3,4};//06:26
        System.out.println(largestTimeFromDigits(A));
    }
}
