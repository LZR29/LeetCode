package medium;

public class No931 {
	
	public static int minFallingPathSum(int[][] A) {
        int len = A.length;
        int min = 0;
        int[][] sum = new int[len][len];
        sum[0] = A[0];
        for(int i = 1; i < len; i++) {
        	for(int j = 0; j < len; j++) {
        		if(j == 0) {
        			sum[i][j] = A[i][j] + Math.min(sum[i-1][j+1], sum[i-1][j]);
        		}else if(j == len - 1) {
        			sum[i][j] = A[i][j] + Math.min(sum[i-1][j-1], sum[i-1][j]);
				}else {
					sum[i][j] = A[i][j] + Math.min(Math.min(sum[i-1][j-1], sum[i-1][j+1]), sum[i-1][j]);
				}
        	}
        }
        min = sum[len-1][0];
        for(int i = 1; i < len; i++) {
        	if(min > sum[len-1][i])
        		min = sum[len-1][i];
        }
        return min;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] A = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(minFallingPathSum(A));
	}

}
