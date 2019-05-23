package sort;


import java.util.Arrays;

/**
 * @author linzerong
 * @create 2019-03-06 23:22
 * 快速排序  http://www.cnblogs.com/chengxiao/p/6262208.html
 */
public class QuickSort {
    public void quickSort(int[] arr){
        quickSort(arr, 0, arr.length-1);
    }
    public void  quickSort(int[] arr, int left, int right){
        if(left < right) {
            dealPivot(arr,left,right);
            int i = left;
            int j = right - 1;
            //取枢纽值做比较
            int pivot = right - 1;
            while (true){
                while (arr[++i] < arr[pivot]){

                }
                while (j > left && arr[--j] > arr[pivot]){

                }
                if(i < j){
                    Swap.swap(arr, i, j);
                }else {
                    break;
                }
            }
            if(i < right){
                Swap.swap(arr, i ,right - 1);
            }
            quickSort(arr, left, i - 1);
            quickSort(arr, i + 1, right);
        }
    }
    //处理枢纽值，放置到数组范围末尾 。三数中值取做枢纽值
    public void dealPivot(int[] arr, int left, int right){
        int mid = (left + right) / 2;
        if(arr[left] > arr[mid]){
            Swap.swap(arr, left, mid);
        }
        if(arr[left] > arr[right]){
            Swap.swap(arr, left, right);
        }
        if(arr[mid] > arr[right]){
            Swap.swap(arr, right, mid);
        }

        Swap.swap(arr, mid, right-1);
    }

    public static void main(String[] args) {
        int[] arr = {1,3,4,6,9,2,3,0,1};       //0,1,1,2,3,3,4,6,9
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println();
    }
}
