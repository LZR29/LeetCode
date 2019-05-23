package contest137;

/**
 * @author linzerong
 * @create 2019-05-19 10:39
 */
public class Remove_All_Adjacent_Duplicates_In_String {
    public String removeDuplicates(String S) {
        StringBuilder sb = new StringBuilder(S);
        for (int i = 0; i < sb.length()-1; ) {
            if(sb.charAt(i) == sb.charAt(i+1)){
                sb.delete(i,i+2);
                i = 0;
            }else {
                i++;
            }
        }
        return sb.toString();
    }
}
