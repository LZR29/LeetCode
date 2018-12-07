package easy;

public class No942 {
	
	public static int[] diStringMatch(String S) {
		int n = S.length(), left = 0, right = n;
        int[] res = new int[n + 1];
        for (int i = 0; i < n; ++i)
            res[i] = S.charAt(i) == 'I' ? left++ : right--;
        res[n] = left;
        return res;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		diStringMatch("DDII");
	}

}
