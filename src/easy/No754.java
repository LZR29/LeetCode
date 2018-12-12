package easy;

/**
 * @authoor linzerong
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


    public static void main(String[] args) {
        System.out.println(reachNumber(6));
        System.out.println(0%2);
    }
}
