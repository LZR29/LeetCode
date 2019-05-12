package medium;

/**
 * @authoor linzerong
 * @create 2019-04-17 13:14
 */
public class No287 {
    public int findDuplicate(int[] nums) {
        //类似找有环链表的环的节点
        int slow = nums[0];
        int fast = nums[nums[0]];
        while (fast != slow){
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        //起点
        fast = 0;
        while (fast != slow){
            fast = nums[fast];
            slow = nums[slow];
        }
        return slow;
    }
}
