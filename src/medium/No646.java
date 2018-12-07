package medium;

import java.util.Arrays;
import java.util.Comparator;

public class No646 {
	
	
	public static int findLongestChain(int[][] pairs) {
		int len = pairs.length;
		int max = 1;
		int[] dp = new int[len];
		Arrays.sort(pairs, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				return o1[0]-o2[0];
			}
		});
		dp[0] = 1;
		for (int i = 1; i < len; i++) {
			dp[i] = 1;
			for (int j = 0; j < i; j++) {
				if(pairs[j][1] < pairs[i][0] && dp[i] < dp[j]+1 ) {
					dp[i] = dp[j] + 1;
				}
			}
		}
		for (int i = 0; i < len; i++) 
			if (max < dp[i]) 
				max = dp[i];
		return max;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] pairs = {{-6,9},{1,6},{8,10},{-1,4},{-6,-2},{-9,8},{-5,3},{0,3}};
		System.out.println(findLongestChain(pairs));
	}

}
