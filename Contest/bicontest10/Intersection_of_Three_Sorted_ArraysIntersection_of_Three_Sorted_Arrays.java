package bicontest10;

import java.util.ArrayList;
import java.util.List;

/**
 * @author linzerong
 * @create 2019-10-05 22:30
 */
public class Intersection_of_Three_Sorted_ArraysIntersection_of_Three_Sorted_Arrays {

    public List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
        int[] count1 = new int[2001];
        int[] count2 = new int[2001];
        int[] count3 = new int[2001];
        for(int i : arr1){
            count1[i]++;
        }
        for(int i : arr2){
            count2[i]++;
        }
        for(int i : arr3){
            count3[i]++;
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < 2001; i++) {
            if(count1[i] != 0 && count2[i] != 0 && count3[i] != 0){
                ans.add(i);
            }
        }
        return ans;
    }
}
