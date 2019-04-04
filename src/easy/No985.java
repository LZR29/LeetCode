package easy;

/**
 * @authoor linzerong
 * @create 2019-02-03 10:36
 */
public class No985 {
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int len = A.length;
        int[] ans = new int[queries.length];
        for (int j = 0; j < queries.length; j++) {
            A[queries[j][1]] += queries[j][0];
            System.out.println(j);
            for (int k = 0; k < len; k++) {
                if(A[k] % 2 == 0){
                    ans[j] += A[k];
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] A = {1,2,3,4};
        int[][] q = {{1,0},{-3,1},{-4,0},{2,3}};
        No985 no985 = new No985();
        no985.sumEvenAfterQueries(A,q);
    }
}
