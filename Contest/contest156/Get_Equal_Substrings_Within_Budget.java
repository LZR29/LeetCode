package contest156;

/**
 * @author linzerong
 * @create 2019-09-29 11:58
 */
public class Get_Equal_Substrings_Within_Budget {
    public int equalSubstring(String s, String t, int maxCost) {
        int[] costs = new int[s.length()];
        int len = s.length();
        for(int i = 0; i < len ; i++){
            costs[i] = Math.abs(s.charAt(i)-t.charAt(i));
        }
        int start = 0;
        int ans = 0;
        int cur = 0;
        for(int i = 0; i < len; i++){
            cur += costs[i];
            if(cur <= maxCost){
                ans = Math.max(i-start+1, ans);
            }else{
                while(start <= i){
                    cur -= costs[start++];
                    if(cur <= maxCost){
                        break;
                    }
                }
            }

        }
        return ans;
    }
}
