package bicontest11;

/**
 * @author linzerong
 * @create 2019-10-19 22:30
 */
public class Missing_Number_In_Arithmetic_Progression {
    public int missingNumber(int[] arr) {
        int len = arr.length;
        int sum = 0;
        int real = 0;
        real = (arr[0] + arr[len-1]) * (len + 1) / 2;
        for(int i : arr){
            sum += i;
        }
        return real - sum;
    }
}
