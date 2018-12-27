package easy;

/**
 * @authoor linzerong
 * @create 2018-12-27 14:30
 */
public class No709 {
    public String toLowerCase(String str) {
        char[] chars = str.toCharArray();
        int len = str.length();
        for (int i = 0; i < len; i++) {
            if('A' <= chars[i] && 'Z' >= chars[i]){
                chars[i] += 32;
            }
        }
        return new String(chars);
    }
}
