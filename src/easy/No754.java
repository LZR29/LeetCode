package easy;

/**
 * @author linzerong
 * @create 2018-12-12 12:39
 */
public class No754 {

    public static int reachNumber(int target) {
        int sum = 0, step = 0;
        target = Math.abs(target);
        while (sum < target){
            step++;
            sum += step;
        }
        while ((sum - target) % 2 != 0){
            step++;
            sum += step;
        }
        return step;
    }

    public  int reachNumber2(int target) {
        //看做在1-i数组里面的添加正负号
        //记录数组添加正号数字之和为p, 添加负号数字之和为n，数组之和为s
        //p + n = s
        //p - n = target
        //两式相减有：
        //s - target = 2 * n   s = (1 + i ) *i / 2
        //求满足 s - target >= 0 且 差为偶数
        if(target < 0){
            target = -target;
        }
        int i = 1;
        while (true){
            int s = (i * i + i) / 2;
            if(s - target >= 0 && (s - target) % 2 == 0){
                break;
            }
            i++;
        }
        return i;
    }

    public static void main(String[] args) {
        System.out.println(reachNumber(6));
        System.out.println(0%2);
    }
}
