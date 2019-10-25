package easy;

/**
 * @author linzerong
 * @create 2019-09-17 9:38
 */
public class No551 {
    public boolean checkRecord(String s) {
        int len = s.length();
        int countA = 0;
        for (int i = 0; i < len; i++) {
            if(s.charAt(i) == 'A'){
                countA++;
                if(countA > 1){
                    return false;
                }
            }else if(s.charAt(i) == 'L'){
                if(i < len-2 && s.charAt(i+1) == 'L' && s.charAt(i+2) == 'L'){
                    return false;
                }
            }
        }
        return true;
    }
}
