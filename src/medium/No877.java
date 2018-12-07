package medium;

import java.util.Arrays;

public class No877 {
	
	public static boolean stoneGame(int[] piles) {
        int alex = 0, lee = 0;
        Arrays.sort(piles);
        for(int i = piles.length-1; i >= 0; i--) {
        	if(i % 2 == 1) {
        		alex += piles[i];
        	}else {
				lee += piles[i];
			}
        }
        return alex > lee;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] piles = {5,3,4,5};
		System.out.println(stoneGame(piles));
	}

}
