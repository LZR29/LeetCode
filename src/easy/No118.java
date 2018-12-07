package easy;

import java.util.ArrayList;
import java.util.List;

public class No118 {
	
	public static List<List<Integer>> generate(int numRows) {
		if(numRows == 0)
			return new ArrayList<>();
        List<List<Integer>> nums = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
			List<Integer> sub = new ArrayList<>();
			for(int j = 0;j <= i;j++) {
				if(j == 0||j == i) {
					sub.add(1);
				}else {
					List<Integer> upSub = nums.get(i - 1);
					sub.add(upSub.get(j - 1)+upSub.get(j));
				}
			}
			nums.add(sub);
		}
       return nums;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
