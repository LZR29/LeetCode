package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No120 {
	
	public static int minimumTotal(List<List<Integer>> triangle) {
     /*   int[] num = new int[triangle.size()];
        if(triangle.size() == 0) 
        	return 0;
        num[0] = triangle.get(0).get(0);
        int k = 0;
        for(int i = 1;i < triangle.size();i++) {
        	List<Integer> list = triangle.get(i);
        	int num1 = list.get(k);
        	int num2 = list.get(k+1);
        	int add = num1 < num2 ? num1:num2;
        	k = num1 < num2 ? k:k+1;
        	num[i] = num[i-1] + add;
        }
        return num[triangle.size()-1];*/
		int[][] num = new int[triangle.size()][];
		for (int i = 0; i < num.length; i++) {
			num[i] = new int[triangle.get(i).size()];
		}
		for(int i = 0;i < triangle.get(triangle.size()-1).size();i++) {
			num[triangle.size()-1][i] = triangle.get(triangle.size()-1).get(i);
		}
		for (int i = triangle.size()-2; i >= 0; i--) {
			for(int j = 0; j < triangle.get(i).size(); j++) {
				int m = triangle.get(i).get(j) + num[i+1][j];
				int n = triangle.get(i).get(j) + num[i+1][j+1];
				num[i][j] = m < n? m:n;
			}
		}
		return num[0][0];
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[][] nums = {{2},{3,4},{6,5,7},{4,1,8,3}};
		List<List<Integer>> triangle = new ArrayList<List<Integer>>();
		List<Integer> list0 = Arrays.asList(nums[0]);
		List<Integer> list1 = Arrays.asList(nums[1]);
		List<Integer> list2 = Arrays.asList(nums[2]);
		List<Integer> list3 = Arrays.asList(nums[3]);
		triangle.add(list0);
		triangle.add(list1);
		triangle.add(list2);
		triangle.add(list3);
		System.out.println(No120.minimumTotal(triangle));
	}

}
