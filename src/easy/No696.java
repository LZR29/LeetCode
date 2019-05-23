package easy;

/**
 * @author linzerong
 * @create 2018-12-07 9:32
 */
public class No696 {

    public static int countBinarySubstrings(String s) {
        int preRun = 0;
        int curRun =1;
        int count = 0;
        //
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


    public static void main(String[] args) {
        System.out.println(countBinarySubstrings("00100")); //2
       System.out.println(countBinarySubstrings("00110011")); //4   "000111000" 6
    }
}
