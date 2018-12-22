package easy;

/**
 * @authoor linzerong
 * @create 2018-12-22 15:42
 */
public class No836 {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        return rec1[0] < rec2[2] && rec2[0] < rec1[2] && rec1[1] < rec2[3] && rec2[1] < rec1[3];
    }
    public static void main(String[] args) {

    }
}
