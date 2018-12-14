package medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @authoor linzerong
 * @create 2018-12-14 21:06
 */
public class No54 {

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if(matrix == null || matrix.length == 0){
            return res;
        }
        int dir = 0; // 0-右，1-下，2-左，3-上.
        int row = matrix.length;
        int col = matrix[0].length;
        int newrow = 0;
        int newcol = 0;
        int count = row * col;
        int i = 0,j = 0;
        while (count > 0){
            if(dir == 0){
                if(j < col){
                    res.add(matrix[i][j++]);
                    count--;
                }else {
                    i++;
                    j--;
                    dir = 1;
                    col--;
                }
            }else if(dir == 1){
                if(i < row){
                    res.add(matrix[i++][j]);
                    count--;
                }else {
                    i--;
                    j--;
                    dir = 2;
                    row--;
                }
            }else if(dir == 2){
                if(j >= newcol){
                    res.add(matrix[i][j--]);
                    count--;
                }else {
                    j++;
                    i--;
                    newcol++;
                    dir = 3;
                }
            }else {
                if(i > newrow){
                    res.add(matrix[i--][j]);
                    count--;
                }else {
                    i++;
                    j++;
                    newrow++;
                    dir = 0;
                }
            }
        }
    /*    for(int k : res){
            System.out.println(k);
        }*/
        return res;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        spiralOrder(matrix);
    }
}
