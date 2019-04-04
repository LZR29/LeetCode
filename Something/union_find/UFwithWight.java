package union_find;

/**
 * @authoor linzerong
 * @create 2019-02-28 15:30
 * 加权union-find算法---quick-union算法
 */
public class UFwithWight {
    private int[] id;   //分量id
    private int count;  //分量数量
    private int[] weight;//权重，各根节点的权重大小
    
    public UFwithWight(int N){
        count = N;
        id = new int[N];
        weight = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
            weight[i] = 1;
        }
    }
    public int getCount(){
        return count;
    }
    public int find(int p){
        while (p != id[p]){
            p = id[p];
        }
        return p;
    }
    public boolean connected(int p, int q){
        return find(p) == find(q);
    }
    public void union(int p ,int q){
        int proot = find(p);
        int qroot = find(q);
        if(proot == qroot){
            return;
        }
        if(weight[proot] < weight[qroot]){
            id[proot] = qroot;
            weight[qroot] += weight[proot];
        }else {
            id[qroot] = proot;
            weight[proot] += weight[qroot];
        }
        count--;
    }
}
