package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author linzerong
 * @create 2018-12-14 22:05
 */
public class No383 {

    public static boolean canConstruct(String ransomNote, String magazine) {
        if( ransomNote.length() > magazine.length()){
            return false;
        }
        int len = magazine.length();
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            map.put(magazine.charAt(i),map.getOrDefault(magazine.charAt(i),0)+1);
        }
        len = ransomNote.length();
        for (int i = 0; i < len; i++) {
            if(map.containsKey(ransomNote.charAt(i))){
                if(map.get(ransomNote.charAt(i)) == 0){
                    return false;
                }else {
                    map.put(ransomNote.charAt(i),map.get(ransomNote.charAt(i))-1);
                }
            }else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
