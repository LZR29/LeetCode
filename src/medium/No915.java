package medium;

/**
 * @authoor linzerong
 * @create 2018-12-14 23:26
 */
public class No915 {

    public static int partitionDisjoint(int[] A) {
        int len = A.length;
        int max = A[0]; //最大
        int premax = A[0];  //前面最大
        int index = 0;
        for (int i = 1; i < len; i++) {
            if(premax > A[i]){
                index = i;
                premax = max;
            }else {
                max = Math.max(A[i],max);
            }
        }
        return index+1;
    }

    public static void main(String[] args) {
        int[] a = {1,1,1,0,6,12};
        System.out.println(partitionDisjoint(a));
    }
}
