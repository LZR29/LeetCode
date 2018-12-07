package easy;

public class No832 {
	
	public int[][] flipAndInvertImage(int[][] A) {
        int len = A.length;
        int temp;
        for(int i = 0; i < len; i++) {
        	for (int j = 0; j < len/2; j++) {
        		temp = A[i][len-j-1];
				A[i][len-j-1] = A[i][j];
				A[i][j] = temp;
			}
        }
        for(int i = 0; i < len; i++) {
        	for (int j = 0; j < len; j++) {
				A[i][j] = A[i][j] == 0? 1:0;
			}
        }
        return A;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
