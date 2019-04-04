package sort;

import java.util.Arrays;

/**
 * @authoor linzerong
 * @create 2019-03-04 21:21
 * 选择，冒泡，插入排序算法。
 */
public class EasySort {
    static public int a = 1;
    //选择排序法。
    void selectSort(int[] arr){
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            //选择最小的下标
            int min = i;
            for (int j = i+1; j < len; j++) {
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            //交换
            if(min != i) {
                Swap.swap(arr, min, i);
            }
        }

    }
    //冒泡排序法。
    public void bubbleSort(int[] arr){
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            //标志flag是为了判断后面是否有序，如果有序就可以不用再排序了
            boolean flag = true;
            for (int j = 0; j < len - i - 1; j++) {
                if(arr[j] > arr[j+1]){
                    flag = false;
                    Swap.swap(arr,j,j+1);
                }
            }
            if(flag){
                break;
            }
        }
    }
    //插入排序法
    public void insertSort(int[] arr){
        int len = arr.length;
        for (int i = 1; i < len; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j-1]){
                Swap.swap(arr,j,j-1);
                j--;
            }
        }
    }
    public static void main(String[] args) {
        EasySort easySort = new EasySort();
        int[] arr = {1,3,4,6,9,2,3,0,1};       //0,1,1,2,3,3,4,6,9
//        easySort.selectSort(arr);
//        easySort.bubbleSort(arr);
        easySort.insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
