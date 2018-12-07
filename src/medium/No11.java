package medium;

public class No11 {
	
	public static int maxArea(int[] height) {
        int len = height.length;
        int low,max = 0;
        for (int i = 0; i < len - 1; i++) {
			for (int j = i+1; j < len; j++) {
				low = height[i] < height[j]? height[i]:height[j];
				max = Math.max(max, low*(j - i));
			}
		}
        return max;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
