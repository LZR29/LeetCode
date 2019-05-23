package contest125;

/**
 * @author linzerong
 * @create 2019-02-24 10:41
 */
public class Find_the_Town_Judge {
    public int findJudge(int N, int[][] trust) {
        int[][] flags = new int[N][2];
        for (int i = 0; i < trust.length; i++) {
            flags[trust[i][0] - 1][0]++;
            flags[trust[i][1] - 1][1]++;
        }
        for (int i = 0; i < N; i++) {
            if(flags[i][0] == 0 && flags[i][1] == N - 1){
                return i + 1;
            }
        }
        return -1;
    }
}
