package contest126;

/**
 * @author linzerong
 * @create 2019-03-03 10:55
 */
public class Check_If_Word_Is_Valid_After_Substitutions {
    public boolean isValid(String S) {
        int i = 0;
        String str ;
        if((i =S.indexOf("abc")) != -1){
            str = S.substring(0,i) + S.substring(i+3);
            return isValid(str);
        }
        if(S.length() <= 0){
            return true;
        }
        return false;
    }
}
