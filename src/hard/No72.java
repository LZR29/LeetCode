package hard;

public class No72 {
	
	public static int minDistance(String word1, String word2) {
        int l1 = word1.length();
        int l2 = word2.length();
        int[][] dp = new int[l1+1][l2+1];
        for(int i = 0; i <= l1; i++) {
        	for (int j = 0; j <= l2; j++) {
				if(i == 0) {
					dp[i][j] = j;
				}else if (j == 0) {
					dp[i][j] = i;
				}else {
					int sum = word1.charAt(i-1) == word2.charAt(j-1) ? 0 : 1;
					dp[i][j] = Math.min(dp[i-1][j-1]+sum, dp[i-1][j]+1);
					dp[i][j] = Math.min(dp[i][j], dp[i][j-1]+1);
				}
			}
        }
        return dp[l1][l2];
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(minDistance("intention", "execution"));
	}

}
