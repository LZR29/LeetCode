package contest153;

import java.util.Calendar;

/**
 * @author linzerong
 * @create 2019-09-08 10:36
 */
public class Day_of_the_Week {
    public String dayOfTheWeek(int day, int month, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, day);
        calendar.set(Calendar.MONTH, month-1);
        calendar.set(Calendar.YEAR, year);
        int ans = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println(ans);
        String res = null;
        if(ans == 7){
            res = "Saturday";
        }
        if(ans == 6){
            res = "Friday";
        }
        if(ans == 5){
            res = "Thursday";
        }
        if(ans == 4){
            res = "Wednesday";
        }
        if(ans == 3){
            res = "Tuesday";
        }
        if(ans == 2){
            res = "Monday";
        }
        if(ans == 1){
            res = "Sunday";
        }
        return res;
    }
}
