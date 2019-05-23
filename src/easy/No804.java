package easy;

import java.util.HashSet;
import java.util.Set;

/**
 * @author linzerong
 * @create 2018-12-27 14:38
 */
public class No804 {
    public int uniqueMorseRepresentations(String[] words) {
        String[] map = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> set = new HashSet<>();
        for(String str : words){
            StringBuilder sb = new StringBuilder();
            for(char c : str.toCharArray()){
                sb.append(map[c - 'a']);
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}
