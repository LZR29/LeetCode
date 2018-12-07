package medium;

public class No413 {
	
	public static int numberOfArithmeticSlices(int[] A) {
        int len = A.length;
        int count = 0;
        int sum = 0;
        for(int i = 2; i < len; i++) {
        	if(A[i] - A[i-1] == A[i-1] - A[i-2]) {
        		count++;
        		sum += count;
        	}else {
				count = 0;
			}
        }
        return sum;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
