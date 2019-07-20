package bicontest4;

/**
 * @author linzerong
 * @create 2019-07-13 22:39
 */
public class Remove_Vowels_from_a_String {
    public String removeVowels(String S) {
        S = S.replace("a","");
        S = S.replace("e","");
        S = S.replace("i","");
        S = S.replace("o","");
        S = S.replace("u","");
        return S;
    }
}
