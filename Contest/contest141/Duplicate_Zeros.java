package contest141;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author linzerong
 * @create 2019-06-16 10:31
 */
public class Duplicate_Zeros {
    public void duplicateZeros(int[] arr) {
        List<Integer> list = new ArrayList<>(arr.length);
        int i = 0;
        while (list.size() < arr.length){
            list.add(arr[i]);
            if(arr[i] == 0){
                list.add(0);
            }
            i++;
        }
        for (int j = 0; j < arr.length; j++) {
            arr[j] = list.get(j);
        }
    }
}
