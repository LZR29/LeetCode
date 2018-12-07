package easy;

/**
 * @authoor linzerong
 * @create 2018-12-07 9:32
 */
public class No696 {

    public static int countBinarySubstrings(String s) {
    //    if (s == null || s.length() == 0) return 0;
        int preRun = 0;
        int curRun =1;
        int count = 0;
        for (int i = 1; i < s.length(); i++){
            if (s.charAt(i) == s.charAt(i-1)) {
                curRun++;
            }
            else {
                preRun = curRun;
                curRun = 1;
            }
            if (preRun >= curRun) {
                count++;
            }
        }
        return count;
    }


    /*public static int countBinarySubstrings1(String s) {
        int count = 0;
        int len = s.length();
        char[] chars = s.toCharArray();
        int num , pre;
        System.out.println(chars[0]+" "+chars[1]);
        for (int i = 1; i < len; ) {
            num = 1;
            while (i < len && chars[i-1] == chars[i]){
                num++;
                i++;
            }
            i++;
            int j = i;
            while (i < len && chars[i-1] == chars[i] && num >= 0){
                num--;
                count++;
                i++;
            }
            i = j;
        }
        return count;
    }*/
    public static void main(String[] args) {
        System.out.println(countBinarySubstrings("00100")); //2
       System.out.println(countBinarySubstrings("00110011")); //4   "000111000" 6
    }
}
