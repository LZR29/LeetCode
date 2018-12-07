package easy;
/*
 * 打扰啦啦啦啦啦绿绿
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class No78 {
	
	public static List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> list = new ArrayList<>();
		list.add(Collections.EMPTY_LIST);
		Arrays.sort(nums);
		int[][] nums2 = new int[nums.length][nums.length];//创建二维数组进行查找子集
		for (int i = 0; i < nums2.length; i++) {
			int k = i;
			for (int j = 0; j < nums2[i].length; j++) {
				nums2[i][j] = nums[(k++)%nums.length];
			}
		}
		int bound = nums2[0][0],index = nums2.length - 1;
		List<Integer> obj;
		for (int j = 0; j <= index; j++) {
			obj = new ArrayList<>();
			obj.add(nums2[0][j]);
			list.add(obj);
		}
		for(int i = 1;i <= index; i++) {	//控制几行
			for (int j = 0; j <= i; j++) {	//控制前几行
				for(int k = 0; k <= index - i; k++) {
					
				}
			}
		}
		return list;
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,3,4,1};
/*		Arrays.sort(nums);
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			list.add(nums[i]);
			while(++i < nums.length && nums[i - 1]==nums[i]);
		}
//		Integer[] num = new Integer[list.size()];
//		list.toArray(num);
		int[][] nums2 = new int[list.size()][list.size()];
		for (int i = 0; i < nums2.length; i++) {
			int k = i;
			for (int j = 0; j < nums2[i].length; j++) {
				nums2[i][j] = list.get((k++)%list.size());
			}
		}
		for (int i = 0; i < nums2.length; i++) {
			for (int j = 0; j < nums2.length; j++) {
				System.out.print(nums2[i][j]);
			}
			System.out.println();
		}
		System.out.println("!!!!");
		
		*
		*if(i == 0) { //第一行
				for (int j = 0; j < len; j++) {
					obj = new ArrayList<>();
					obj.add(nums2[0][j]);
					list.add(obj);
				}
			}else {	//其它行
				for (int k = 0; k < len; k++) {
					obj = new ArrayList<>();
					obj.add(nums2[0][k]);
					for (int j = 0; j <= i; j++) {
						
					}	
				}
			}
		*/
		subsets(nums);
	}

}
