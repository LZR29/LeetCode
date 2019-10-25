package contest154;

/**
 * @author linzerong
 * @create 2019-09-15 10:31
 */
public class Maximum_Number_of_Balloons {
    public int maxNumberOfBalloons(String text) {
        int[] map = new int[26];
        int len = text.length();
        for (int i = 0; i < len; i++) {
            map[text.charAt(i) - 'a']++;
        }
        int b = map[1];
        int a = map[0];
        int l = map['l'-'a'];
        int o = map['o'-'a'];
        int n = map['n'-'a'];
        int count = 0;
        while (!(b < 1 || a < 1 || l < 2 || o < 2 || n < 1)){
            count++;
            b--;
            a--;
            l -= 2;
            o -= 2;
            n --;
        }
        return count;
    }
}
