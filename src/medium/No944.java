package medium;

public class No944 {
	
	public static int minDeletionSize(String[] A) {
		if(A.length <= 1)
			return 0;
		int len = A.length;
		int col = A[0].length();
		int count = 0;
		char[][] chars = new char[col][len];
		for(int i = 0; i < col; i++) {
			for(int j = 0;j < len; j++) {
				chars[i][j] = A[j].charAt(i); 
			}
		}
		for(int i = 0; i < col; i++) {
			for(int j = 0;j < len - 1; j++) {
				if(chars[i][j] > chars[i][j+1]) {
					count++;
					break;
				}
			}
		}
		return count;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] A = {"abc","def","das"};
		System.out.println(minDeletionSize(A));
	}

}
