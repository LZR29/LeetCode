package union_find;

/**
 * @author linzerong
 * @create 2019-02-28 9:07
 * quick-find 算法 quick-union 算法
 */
public class UF {
    private int[] id;   //分量id
    private int count;  //分量数量
    public UF(int N){
        //初始化分量数据id
        count = N;
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }
    public int getCount(){
        return count;
    }
    public boolean connected(int p ,int q){
        return find(p) == find(q);
    }
    public int find(int p) {
        /*//quick-find 算法
        return id[p];
        */
        //quick-union算法
        while (p != id[p]){
            p = id[p];
        }
        return p;
    }
    public void union(int p ,int q){
        /*//quick-find 算法
        int pid = find(p);
        int qid = find(q);
        if(pid == qid){
            return;
        }
        for (int i = 0; i < id.length; i++) {
            if(id[i] == pid){
                id[i] = qid;
            }
        }
        count--;*/

        //quick-union 算法
        int proot = find(p);
        int qroot = find(q);
        if(proot == qroot){
            return;
        }
        id[proot] = qroot;
        count--;
    }


}
