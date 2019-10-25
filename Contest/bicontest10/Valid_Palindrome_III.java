package bicontest10;

/**
 * @author linzerong
 * @create 2019-10-06 23:18
 */
public class Valid_Palindrome_III {
    public boolean isValidPalindrome(String s, int k) {
        StringBuilder sb = new StringBuilder(s);
        int need = lcs(s, sb.reverse().toString());
        return (s.length()- need) <= k;
    }
    public int lcs(String s1, String s2){
        int n = s1.length();
        int m = s2.length();
        int[][] dp = new int[n+1][m+1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(s1.charAt(i) == s2.charAt(j)){
                    dp[i+1][j+1] = dp[i][j] + 1;
                }else {
                    dp[i+1][j+1] = Math.max(dp[i+1][j], dp[i][j+1]);
                }
            }
        }
        return dp[n][m];
    }
}
