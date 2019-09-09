package contest153;

/**
 * @author linzerong
 * @create 2019-09-08 10:31
 */
public class Distance_Between_Bus_Stops {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int sum = 0;
        int len = distance.length;
        for(int i : distance){
            sum += i;
        }
        int ans = 0;
        for (int i = start; i != destination; i = (i+1) % len) {
            ans += distance[i];
        }
        return Math.min(ans, sum-ans);
    }
}
