package bicontest8;

import java.util.*;

/**
 * @author linzerong
 * @create 2019-09-08 9:25
 */
public class Before_and_After_Puzzle {
    public List<String> beforeAndAfterPuzzles(String[] phrases) {
        Map<String, List<Integer>> headmap = new HashMap<>();
        int len = phrases.length;
        for (int i = 0; i < len; i++) {
            int first = phrases[i].indexOf(' ');
            if(first != -1) {
                String head = phrases[i].substring(0, first);
                if (headmap.containsKey(head)) {
                    headmap.get(head).add(i);
                } else {
                    List<Integer> list = new ArrayList<>();
                    list.add(i);
                    headmap.put(head, list);
                }
            }else {
                if (headmap.containsKey(phrases[i])) {
                    headmap.get(phrases[i]).add(i);
                } else {
                    List<Integer> list = new ArrayList<>();
                    list.add(i);
                    headmap.put(phrases[i], list);
                }
            }
        }
        Set<String> set = new TreeSet<>((o1, o2) -> o1.compareTo(o2));
        for (int i = 0; i < len; i++) {
            int last = phrases[i].lastIndexOf(' ');
            if(last != -1){
                String tail = phrases[i].substring(last+1);
                if(headmap.containsKey(tail)){
                    List<Integer> list = headmap.get(tail);
                    for(int j : list) {
                        if(j != i){
                            String ans = phrases[i].substring(0, last) + " " + phrases[j];
                            set.add(ans);
                        }
                    }
                }
            }else {
                if(headmap.containsKey(phrases[i])){
                    List<Integer> list = headmap.get(phrases[i]);
                    for(int j : list){
                        if(j != i){
                            set.add(phrases[j]);
                        }
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }
}
