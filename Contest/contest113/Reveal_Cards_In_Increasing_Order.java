package contest113;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @authoor linzerong
 * @create 2018-12-02 13:45
 */
public class Reveal_Cards_In_Increasing_Order {

    public int[] deckRevealedIncreasing(int[] deck) {
        int len = deck.length;
        int[] res = new int[len];
        Arrays.sort(deck);
        Queue<Integer> index = new LinkedList<>();
        for(int i = 0; i < len; i++){
            index.add(i);
        }
        for(int i = 0; i < len; i++){
            res[index.poll()] = deck[i];
            index.add(index.poll());
        }
        return res;
    }

    public static void main(String[] args) {

    }
}
