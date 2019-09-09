package medium;

/**
 * @author linzerong
 * @create 2019-08-22 23:14
 */
public class No75 {
    public void sortColors(int[] nums) {
        int len = nums.length;
        //0指针
        int p0 = 0;
        //2指针
        int p2 = len - 1;
        //当前元素指针
        int cur = 0;
        int temp;
        while (cur <= p2){
            if(nums[cur] == 0){
                temp = nums[p0];
                nums[p0] = 0;
                nums[cur] = temp;
                cur++;
                p0++;
            }else if(nums[cur] == 2){
                temp = nums[p2];
                nums[p2] = 2;
                nums[cur] = temp;
                p2--;
            }else {
                cur++;
            }
        }
    }
}
