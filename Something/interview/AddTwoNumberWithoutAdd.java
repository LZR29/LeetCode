package interview;

/**
 * @author linzerong
 * @create 2019-03-03 20:52
 */
public class AddTwoNumberWithoutAdd {
    public int getSum(int a, int b) {
        int sum = a ^ b;
        int carry = (a & b) << 1;
        while(carry != 0){
            int n1 = sum;
            int n2 = carry;
            sum = n1 ^ n2;
            carry = (n1 & n2) << 1;
        }
        return sum;
    }
}
