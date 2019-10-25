package contest156;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author linzerong
 * @create 2019-09-29 10:30
 */
public class Unique_Number_of_Occurrences {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : arr){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        Set<Integer> set = new HashSet<>();
        for(int v : map.values()){
            if(set.contains(v)){
                return false;
            }
            set.add(v);
        }
        return true;
    }
}
