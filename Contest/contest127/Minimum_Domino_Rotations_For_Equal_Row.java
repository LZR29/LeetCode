package contest127;

/**
 * @authoor linzerong
 * @create 2019-03-10 12:36
 */
public class Minimum_Domino_Rotations_For_Equal_Row {
    public int minDominoRotations(int[] A, int[] B) {
        int[] count = new int[7];
        int len = A.length;
        for (int i = 0; i < len; i++) {
            count[A[i]]++;
            if(A[i] != B[i]){
                count[B[i]]++;
            }
        }
        int num = -1;
        for (int i = 1; i < 7; i++) {
            if(count[i] == len){
                num = i;
            }
        }
        if(num == -1){
            return -1;
        }
        int a = 0, b = 0;
        for (int i = 0; i < len; i++) {
            if(num == A[i]){
                a++;
            }
            if(num == B[i]){
                b++;
            }
        }
        return len- (Math.max(a,b));
    }
}
