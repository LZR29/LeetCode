package contest143;

/**
 * @author linzerong
 * @create 2019-06-30 10:30
 */
public class Distribute_Candies_to_People {
    public int[] distributeCandies(int candies, int num_people) {
        int[] ans = new int[num_people];
        int cur = 1;
        for (int i = 0; i < num_people - 1; i = (i + 1) % num_people) {
            if(candies < cur){
                ans[i] = candies;
                break;
            }
            candies -= cur;
            ans[i] = cur;
            cur++;
        }
        System.out.println(candies);
        return ans;
    }
}
