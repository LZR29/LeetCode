package hard;

/**
 * @author linzerong
 * @create 2019-08-19 23:14
 */
public class No4 {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        //nums1为短数组
        if(m > n){
            int[] t = nums1;
            nums1 = nums2;
            nums2 = t;
            int tm = m;
            m = n;
            n = tm;
        }
        int start = 0;
        int end = m;
        //加1为了奇数长度
        int mid = (m + n + 1) / 2;
        while (start <= end){
            //对短数组二分查找
            int i = start + (end - start) / 2;
            //i相应的长数组下标
            int j = mid - i;
            if(i < end && nums1[i] < nums2[j-1]){
                //i偏小，需要右移
                start = i + 1;
            }else if (i > start && nums1[i-1] > nums2[j]){
                //i偏大
                end = i - 1;
            }else {
                //i刚好或者到达数组边界
                int maxLeft;
                //到左边界
                if(i == 0){
                    maxLeft = nums2[j-1];
                }else if(j == 0){
                    maxLeft = nums1[i-1];
                }else {
                    maxLeft = Math.max(nums1[i-1], nums2[j-1]);
                }
                if((m+n) % 2 == 1){
                    //奇数
                    return maxLeft;
                }
                int minRight;
                if(i == m){
                    minRight = nums2[j];
                }else if(j == n){
                    minRight = nums1[i];
                }else {
                    minRight = Math.min(nums1[i], nums2[j]);
                }
                return ( maxLeft + minRight )/ 2.0;
            }
        }
        return 0.0;
    }
}
