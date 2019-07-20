package contest145;

import java.util.TreeMap;

/**
 * @author linzerong
 * @create 2019-07-14 10:31
 */
public class Relative_Sort_Array {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int i : arr1) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        int i = 0;
        for(int j = 0; j < arr2.length; j++) {
            int count = map.get(arr2[j]);
            for (int k = 0; k < count; k++) {
                arr1[i] = arr2[j];
                i++;
            }
            map.remove(arr2[j]);
        }
        for(int k : map.keySet()) {
            int count = map.get(k);
            for (int j = 0; j < count; j++) {
                arr1[i] = k;
                i++;
            }
        }
        return arr1;
    }
}
