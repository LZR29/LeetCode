package contest139;

/**
 * @author linzerong
 * @create 2019-06-02 10:30
 */
public class Greatest_Common_Divisor_of_Strings {
    public String gcdOfStrings(String s, String t) {
        if(s.length() < t.length()){
            String temp = s;
            s = t;
            t = temp;
        }
        if(!s.contains(t)){
            return "";
        }
        int len1 = s.length();
        int len2 = t.length();
        String ans = "";
        for (int i = 1; i <= t.length(); i++) {
            if(len1 % i == 0 && len2 % i == 0){
                String cur = t.substring(0,i);
                StringBuilder sb1 = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                int c1 = len1 / i;
                int c2 = len2 / i;
                for (int j = 0; j < c1; j++) {
                    sb1.append(cur);
                }
                for (int j = 0; j < c2; j++) {
                    sb2.append(cur);
                }
                if(s.equals(sb1.toString()) && t.equals(sb2.toString())){
                    ans = cur;
                }
            }

        }
        return ans;
    }
}
