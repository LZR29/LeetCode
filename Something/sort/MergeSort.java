package sort;

import java.util.Arrays;

/**
 * @authoor linzerong
 * @create 2019-03-06 22:58
 * 归并排序
 */
public class MergeSort {

    public void mergeSort(int[] arr){
        int[] temp = new int[arr.length];
        mergeSort(arr, 0, arr.length-1, temp);
    }
    public void mergeSort(int[] arr, int left, int right, int[] temp){
        if(left < right){
            int mid = (left + right) / 2;
            mergeSort(arr,0,mid,temp);  //合并左边序列
            mergeSort(arr, mid+1, right, temp);     //合并右边序列
            merge(arr, left, mid, right, temp);
        }
    }
    public void merge(int[] arr, int left, int mid, int right,int[] temp){
        int i = left;   //左边序列
        int j = mid + 1;    //右边序列
        int t = 0;          //temp数组
        while (i <= mid && j <= right){
            if(arr[i] <= arr[j]){
                temp[t++] = arr[i++];
            }else {
                temp[t++] = arr[j++];
            }
        }
        while (i <= mid){
            //左边剩余的复制进temp数组
            temp[t++] = arr[i++];
        }
        while (j <= right){
            //右边剩余的复制进temp数组
            temp[t++] = arr[j++];
        }
        t = 0;      //复制回去原数组
        while (left <= right){
            arr[left++] = temp[t++];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,3,4,6,9,2,3,0,1};       //0,1,1,2,3,3,4,6,9
        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
