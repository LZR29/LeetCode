package contest138;

/**
 * @author linzerong
 * @create 2019-05-26 12:10
 */
public class Grumpy_Bookstore_Owner {
    public int maxSatisfied(int[] customers, int[] grumpy, int X) {
        int count = 0;
        int start = 0;
        int max = 0;
        for (int i = 0; i < grumpy.length - X + 1; i++) {
            int cur = 0;
            for (int j = 0; j < X; j++) {
                 cur += (grumpy[i+j] == 1 ? customers[i+j] : 0);
            }
            if(cur > max){
                start = i;
                max = cur;
            }
        }
        for (int i = 0; i < customers.length; i++) {
            if(i >= start && i < start+X){
                count += customers[i];
            }else {
                count += (grumpy[i] == 0 ? customers[i] : 0);
            }
        }
        return count;
    }
}
