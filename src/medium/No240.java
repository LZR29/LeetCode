package medium;

/**
 * @authoor linzerong
 * @create 2018-12-20 15:12
 */
public class No240 {

    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0 || matrix[0].length == 0){
            return false;
        }
        int row = matrix.length;
        int col = matrix[0].length - 1;
        for (int i = 0; i < row; ) {
            if(col != 0){
                if(matrix[i][col] > target){
                    col--;
                }else if(matrix[i][col] == target){
                    return true;
                }else {
                    i++;
                }
            }else {
                if(matrix[i][col] < target) {
                    i++;
                }else if(matrix[i][col] > target){
                    return false;
                }else {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
