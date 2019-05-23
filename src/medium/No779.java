package medium;

/**
 * @author linzerong
 * @create 2018-12-08 16:38
 */
public class No779 {

    public static int kthGrammar(int N, int K) {
        if(K == 1){
            return 0;
        }
        if(K % 2 == 0){
            return kthGrammar(N-1,(K+1)/2) == 0 ? 1 : 0 ;
        }
        return  kthGrammar(N-1,(K+1)/2);
    }

    public static void main(String[] args) {
        System.out.println(kthGrammar(2,1));
    }
}
