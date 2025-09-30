package T_CalenderClass;

import java.util.*;

public class a_CalendarClass {
    public static void main(String[] args) {
        int day = 5, month = 8, year = 2015;

        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day);   // month - 1 because Calendar months are 0-based

        String dayOfWeek = cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.ENGLISH);
        System.out.println("Calendar: " + dayOfWeek.toUpperCase());
    }
}

