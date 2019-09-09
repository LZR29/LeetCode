package bicontest7;



import java.util.ArrayList;
import java.util.List;


/**
 * @author linzerong
 * @create 2019-08-24 22:36
 */
public class FileSystem {
    TrieNode root;
    public FileSystem() {
        root = new TrieNode("",0);
        root.isWord = false;
    }

    public boolean create(String path, int value) {
        String[] paths = path.split("/");
        int index = 0;
        TrieNode cur = root;
        boolean ans = create(paths, index+1, cur, value);
        return ans;
    }
    public boolean create(String[] paths, int index, TrieNode cur, int val){
        if(index == paths.length-1){
            if(cur.children.size() == 0){
                TrieNode node = new TrieNode(paths[index], val);
                node.isWord = false;
                cur.children.add(node);
            }
            cur.children.add(new TrieNode(paths[index], val));
            return true;
        }
        for (int i = 0; i < cur.children.size(); i++) {
            TrieNode node = cur.children.get(i);
            if (node.key.equals(paths[index])) {
                return create(paths, index+1, node, val);
            }
        }
        return false;
    }
    public int get(String path) {
        String[] paths = path.split("/");
        int ans = -1;
        ans = get(paths, 1, root);
        return ans;
    }
    public int get(String[] paths, int index, TrieNode cur){
        if(index == paths.length-1){
            for (int i = 0; i < cur.children.size(); i++) {
                TrieNode node = cur.children.get(i);
                if(node.isWord && node.key.equals(paths[index])){
                    return node.val;
                }
            }
            return -1;
        }else {
            for (int i = 0; i < cur.children.size(); i++) {
                TrieNode node = cur.children.get(i);
                if(node.key.equals(paths[index])){
                    return get(paths, index+1, node);
                }
            }
        }
        return -1;
    }

    class TrieNode {
        public String key;
        public boolean isWord;
        public int val;
        public List<TrieNode> children = new ArrayList<>();
        public TrieNode() {
        }
        public  TrieNode(String s, int v){
            isWord = true;
            key = s;
            val = v;
        }
    }
}
//[null,false,-1,-1,-1,false,true,true,-1]