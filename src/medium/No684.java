package medium;

/**
 * @authoor linzerong
 * @create 2019-02-28 9:22
 */
public class No684 {
    public  int[] findRedundantConnection(int[][] edges) {
        int[] res = edges[0];
        UF uf = new UF(edges.length);
        for (int i = 0; i < edges.length; i++) {
            if(!uf.connected(edges[i][0] - 1 ,edges[i][1] - 1)){
                uf.union(edges[i][0] - 1 ,edges[i][1] - 1);
            }else {
                res = edges[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] edges = {{1,2},{2,3},{3,4},{1,4},{1,5}};
        No684 no684 = new No684();
        System.out.println(no684.findRedundantConnection(edges)[1]);
    }
    class UF{
        int[] id;
        public UF(int n){
            id = new int[n];
            for (int i = 0; i < n; i++) {
                id[i] = i;
            }
        }
        public int find(int p){
            while (p != id[p]){
                p = id[p];
            }
            return p;
        }
        public void union(int p ,int q){
            int proot = find(p);
            int qroot = find(q);
            if(proot == qroot){
                return;
            }
            id[proot] = qroot;
        }
        public boolean connected(int p, int q){
            return find(p) == find(q);
        }
    }
}
