package easy;

/**
 * @author linzerong
 * @create 2019-09-17 9:47
 */
public class No415 {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int more = 0;
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        while (i >= 0 || j >= 0){
            int ni = i >= 0 ? num1.charAt(i)-'0' : 0;
            int nj = j >= 0 ? num2.charAt(j)-'0' : 0;
            int temp = ni + nj + more;
            sb.append(temp % 10);
            more = temp / 10;
            i--;
            j--;
        }
        if(more != 0){
            sb.append(more);
        }
        return sb.reverse().toString();
    }
}
