package sort;

import java.util.Arrays;

/**
 * @authoor linzerong
 * @create 2019-03-04 22:56
 */
public class ShellSort {
    public void shellSort(int[] arr){
        int len = arr.length;
        //希尔增量h
        int h = 1;
        while (h < len / 3){
            h = 3 * h + 1;
        }
        while (h >= 1){
            //将数组变为h有序的
            for (int i = h; i < len; i ++) {
                //将a[i] 插入到a[i-h]，a[i-2*h]...中
                for (int j = i; j >= h; j -= h) {
                    if(arr[j] < arr[j-h]){
                        Swap.swap(arr,j,j-h);
                    }else {
                        //这部分数据说明h有序的
                        break;
                    }
                }
            }
            h = h / 3;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,3,4,6,9,2,3,0,1};       //0,1,1,2,3,3,4,6,9
        ShellSort shellSort = new ShellSort();
        shellSort.shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
