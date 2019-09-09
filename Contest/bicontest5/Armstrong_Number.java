package bicontest5;

/**
 * @author linzerong
 * @create 2019-07-27 22:34
 */
public class Armstrong_Number {

    public boolean isArmstrong(int N) {
        int len = 0;
        int temp = N;
        while (temp != 0){
            len++;
            temp /= 10;
        }
        int sum = 0;
        temp = N;
        while (temp != 0){
            int n = temp % 10;
            temp /= 10;
            sum += Math.pow(n, len);
        }
        return sum == N;
    }

}
