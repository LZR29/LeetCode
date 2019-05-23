package medium;

/**
 * @author linzerong
 * @create 2019-02-28 15:10
 */
public class No547 {
    public int findCircleNum(int[][] M) {
        UF uf = new UF(M.length);
        for (int i = 0; i < M.length; i++) {
            for (int j = i+1; j < M.length; j++) {
                if(M[i][j] == 1) {
                    if (!uf.connected(i, j)) {
                        uf.union(i, j);
                    }
                }
            }
        }
        return uf.count;
    }
    class UF{
        int[] id;
        int count;
        public UF(int n){
            id = new int[n];
            for (int i = 0; i < n; i++) {
                id[i] = i;
            }
            count = n;
        }
        public int find(int p){
            while (p != id[p]){
                p = id[p];
            }
            return p;
        }
        public void union(int p, int q){
            int pid = find(p);
            int qid = find(q);
            if(pid == qid){
                return;
            }
            count--;
            id[pid] = qid;
        }
        public boolean connected(int p, int q){
            return find(p) == find(q);
        }
        
    }
}
