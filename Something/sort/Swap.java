package sort;

/**
 * @author linzerong
 * @create 2019-03-04 21:17
 */
public class Swap {
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        //下面这种方法虽然减少了temp变量开销，但要注意当i==j的情况，会使之为0
        /*arr[i] ^= arr[j];
        arr[j] ^= arr[i];
        arr[i] ^= arr[j];*/
    }
}
