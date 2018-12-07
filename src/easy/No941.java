package easy;

public class No941 {
	
	public static boolean validMountainArray(int[] A) {
		if(A.length < 3)
			return false;
		int i = 0, left = 0, right = 0 , len = A.length;
		for (i = 0; i < len - 1; i++) {
			if(A[i] < A[i+1]) {
				left++;
			}else {
				break;
			}
		}
		if(left == len - 1)
			return false;
		for(;i < len - 1; i++) {
			if(A[i] > A[i+1])
				right++;
			else {
				break;
			}
		}
		if(right == len - 1 || right + left != len - 1)
			return false;
		return true;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {9,8,7,6,5,4,3,2,1,0};
		System.out.println(validMountainArray(A));
	}

}
