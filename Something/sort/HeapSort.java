package sort;

import java.util.Arrays;

/**
 * @author linzerong
 * @create 2019-03-05 20:35
 * 堆排序，数组分成二叉堆（大顶堆（升序），小顶堆（降序））
 */
public class HeapSort {
    //调整堆成为大顶堆,参数len是要调整的长度，因为不是每次都调整整个数组，只要调整无序的部分
    public void adjust(int[] arr, int i, int len ){
        //保存当前元素
        int temp = arr[i];
        //从它的左节点开始判断
        for (int j = 2*i+1; j < len; j = 2*j+1) {
            //指向大的子节点
            if(j+1 < len && arr[j] < arr[j+1]){
                j++;
            }
            if(arr[j] > temp){
                //如果子节点大于它就把子节点上浮，然后往下一层即j = 2*j+1
                arr[i] = arr[j];
                i = j;
            }else {
                break;
            }
        }
        //最终找到适合位置
        arr[i] = temp;
    }
    public void heapSort(int[] arr){
        //调整大顶堆，从第一个非叶子节点调整
        for (int i = arr.length/2 - 1; i >= 0; i--) {
            adjust(arr,i,arr.length);
        }
        //因为大顶堆的数组第一个数总是最大的，所以把它换到最后
        for (int i = arr.length - 1; i > 0; i--) {
            Swap.swap(arr,0,i);
            adjust(arr,0,i);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,3,4,6,9,2,3,0,1};       //0,1,1,2,3,3,4,6,9
        HeapSort heapSort = new HeapSort();
        heapSort.heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
