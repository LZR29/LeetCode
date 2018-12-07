package easy;

public class N0868 {
	
	public static int binaryGap(int N) {
		int i = 0, j = -1;
		int max = 0;
		while(N != 0) {
			i++;
			if(N % 2 != 0) {
				if (j != -1) {
                    max = Math.max(max, i-j);
                }
                j = i;
			}
			N = N >> 1;
		}
        return max;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(binaryGap(22));
	}

}
