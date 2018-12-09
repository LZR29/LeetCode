package contest114;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @authoor linzerong
 * @create 2018-12-09 10:34
 * Accept!!!
 */
public class Verifying_an_Alien_Dictionary {

    public static boolean isAlienSorted(String[] words, String order) {
        List<String> strings = new ArrayList<>(Arrays.asList(words));
        strings.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int len = o1.length() > o2.length() ? o2.length() : o1.length();
                for(int i = 0; i < len; i++){
                    if(order.indexOf(o1.charAt(i)) > order.indexOf(o2.charAt(i))){
                        return 1;
                    }else if(order.indexOf(o1.charAt(i)) < order.indexOf(o2.charAt(i))){
                        return -1;
                    }else {
                        continue;
                    }
                }
                return o1.length() - o2.length();
            }
        });
        for (int i = 0; i < strings.size(); i++) {
           if(strings.get(i).equals(words[i])){
               continue;
           }else {
               return false;
           }
        }
        return true;
    }

    public static void main(String[] args) {
        String [] words = {"word","world","row"};
        String order = "worldabcefghijkmnpqstuvxyz";
        System.out.println(isAlienSorted(words ,order));
    }
}
