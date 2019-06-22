package easy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author linzerong
 * @create 2019-06-02 10:13
 */
public class No1065 {
    public boolean helper(String text, String word, int start){
        int index = 0;
        System.out.println(start);
        for(int i = start; i < text.length(); i++){
            if(text.charAt(i) == word.charAt(index) && index < word.length()){
                index++;
                System.out.println(index);
            }else{
                break;
            }
        }
        return index == word.length();
    }
    public int[][] indexPairs(String text, String[] words) {
        List<int[]> ans = new ArrayList<>();
        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < words.length; j++) {
                if(helper(text, words[j], i)){
                    ans.add(new int[]{i, i+words[j].length()-1});
                }
            }
        }
        ans.sort(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0]){
                    return o1[1] - o2[1];
                }
                return o1[0]-o2[0];
            }
        });
        int[][] res = new int[ans.size()][2];
        for (int i = 0; i < ans.size(); i++) {
            res[i][0] = ans.get(i)[0];
            res[i][1] = ans.get(i)[1];
        }
        return res;
    }
}
