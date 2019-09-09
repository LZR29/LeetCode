package contest147;

import java.util.HashMap;
import java.util.Map;

/**
 * @author linzerong
 * @create 2019-07-28 10:43
 */
public class Alphabet_Board_Path {
    static Map<Character,int[]> map = new HashMap<Character, int[]>();
    static {
        map = new HashMap<>();
        map.put('a',new int[]{0,0});
        map.put('b',new int[]{0,1});
        map.put('c',new int[]{0,2});
        map.put('d',new int[]{0,3});
        map.put('e',new int[]{0,4});
        map.put('f',new int[]{1,0});
        map.put('g',new int[]{1,1});
        map.put('h',new int[]{1,2});
        map.put('i',new int[]{1,3});
        map.put('j',new int[]{1,4});
        map.put('k',new int[]{2,0});
        map.put('l',new int[]{2,1});
        map.put('m',new int[]{2,2});
        map.put('n',new int[]{2,3});
        map.put('o',new int[]{2,4});
        map.put('p',new int[]{3,0});
        map.put('q',new int[]{3,1});
        map.put('r',new int[]{3,2});
        map.put('s',new int[]{3,3});
        map.put('t',new int[]{3,4});
        map.put('u',new int[]{4,0});
        map.put('v',new int[]{4,1});
        map.put('w',new int[]{4,2});
        map.put('x',new int[]{4,3});
        map.put('y',new int[]{4,4});
        map.put('z',new int[]{5,0});
    }
    public String alphabetBoardPath(String target) {

        StringBuilder sb = new StringBuilder();
        int[] cur = new int[]{0,0};
        for (int i = 0; i < target.length(); i++) {
            if(target.charAt(i) != 'z' ) {
                int[] next = map.get(target.charAt(i));
                int[] res = new int[]{cur[0] - next[0], cur[1] - next[1]};
                cur = next;
                if (res[0] > 0) {
                    for (int j = 0; j < res[0]; j++) {
                        sb.append('U');
                    }
                } else if (res[0] < 0) {
                    res[0] = -res[0];
                    for (int j = 0; j < res[0]; j++) {
                        sb.append('D');
                    }
                }
                if (res[1] > 0) {
                    for (int j = 0; j < res[1]; j++) {
                        sb.append('L');
                    }
                } else if (res[1] < 0) {
                    res[1] = -res[1];
                    for (int j = 0; j < res[1]; j++) {
                        sb.append('R');
                    }
                }
            }else if (target.charAt(i) == 'z'){
                int[] res = new int[]{cur[0] - 5, cur[1] - 0};
                cur = new int[]{5,0};
                for (int j = 0; j < res[1]; j++) {
                    sb.append('L');
                }
                for (int j = 0; j < Math.abs(res[0]); j++) {
                    sb.append('D');
                }
            }
            sb.append('!');
        }
        return sb.toString();
    }

}
