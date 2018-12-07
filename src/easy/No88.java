package easy;

public class No88 {
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
	/*	int[] num1 = new int[m];
		for (int i = 0; i < m; i++) {
			num1[i] = nums1[i];
		}
		for (int i = 0,j=0,k=0; i < nums1.length&&(j<m||k<n); i++) {
			if(m ==j) {
				nums1[i] = nums2[k];
				k++;
			}else if (k==n) {
				nums1[i] = num1[j];
				j++;
			}else {
				if(num1[j]<=nums2[k]) {
					nums1[i] = num1[j];
					j++;
				}else {
					nums1[i] = nums2[k];
					k++;
				}
			}
		}*/
		int p = m--+ n-- -1;
		while (m>=0 && n>=0) {
			nums1[p--] = nums1[m] > nums2[n]? nums1[m--]:nums2[n--];
		}
		while (n >= 0) {
			nums1[p--] = nums2[n--];
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {1,2,3,0,0,0};
		int[] nums2 = {1,5,6};
		No88.merge(nums1, 3, nums2, 3);
		for (int a : nums1) {
			System.out.println(a);
		}
	}

}
