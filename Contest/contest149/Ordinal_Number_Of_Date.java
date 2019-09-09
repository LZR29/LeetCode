package contest149;

import java.util.Calendar;

/**
 * @author linzerong
 * @create 2019-08-11 10:30
 */
public class Ordinal_Number_Of_Date {
    public int ordinalOfDate(String date) {
        Calendar calendar = Calendar.getInstance();
        String[] strings = date.split("-");
        calendar.set(Calendar.YEAR, Integer.parseInt(strings[0]));
        calendar.set(Calendar.MONTH, Integer.parseInt(strings[1])-1);
        calendar.set(Calendar.DATE, Integer.parseInt(strings[2]));
        return calendar.get(Calendar.DAY_OF_YEAR);
    }
}
