package medium;

import javax.print.attribute.standard.Media;
import java.lang.reflect.Array;
import java.util.*;

/**
 * @author linzerong
 * @create 2019-08-22 22:01
 */
public class No49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if(map.containsKey(key)){
                map.get(key).add(s);
            }else {
                List<String> list = new ArrayList<>();
                list.add(s);
                map.put(key, list);
            }
        }
        List<List<String>> ans = new ArrayList<>();
        for(String key : map.keySet()){
            ans.add(map.get(key));
        }
        return ans;
    }
}
