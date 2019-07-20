package bicontest4;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

/**
 * @author linzerong
 * @create 2019-07-13 22:30
 */
public class Number_of_Days_in_a_Month {
    public int numberOfDays(int Y, int M) {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, Y);
        c.set(Calendar.MONTH, M-1);
        return c.getActualMaximum(Calendar.DAY_OF_MONTH);
    }
}
