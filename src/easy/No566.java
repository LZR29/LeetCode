package easy;

/**
 * @author linzerong
 * @create 2018-12-11 22:41
 */
public class No566 {

    public static int[][] matrixReshape(int[][] nums, int r, int c) {
        if(nums.length <= 0 || nums.length * nums[0].length != r * c){
            return nums;
        }
        int[][] res = new int[r][c];
        int row = nums.length;
        int col = nums[0].length;
        int index = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                index = i * col + j;
               res[index/c][index%c] = nums[i][j];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] nums = {{1},{2},{3},{4}};
        System.out.println(matrixReshape(nums,2,2));
    }
}
