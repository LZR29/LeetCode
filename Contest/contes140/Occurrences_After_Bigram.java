package contes140;

import java.util.ArrayList;
import java.util.List;

/**
 * @author linzerong
 * @create 2019-06-09 10:30
 */
public class Occurrences_After_Bigram {
    public String[] findOcurrences(String text, String first, String second) {
        List<String> ans = new ArrayList<>();
        String[] strings = text.split(" ");
        for (int i = 0; i < strings.length-1; i++) {
            if(strings[i].equals(first) && strings[i+1].equals(second) && i+2 < strings.length){
                ans.add(strings[i+2]);
            }
        }
        String[] res = new String[ans.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = ans.get(i);
        }
        return res;
    }
}
