package medium;

/**
 * @author linzerong
 * @create 2019-09-14 15:51
 */
public class No223 {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        if(C < E || B > H || F > D || G < A){
            return (C-A)*(D-B)+(G-E)*(H-F);
        }
        int len = Math.min(C, G) - Math.max(A, E);
        int wid = Math.min(D, H) - Math.max(B, F);
        return (C-A) * (D-B) + (G-E) * (H-F) - len * wid;
    }
}
