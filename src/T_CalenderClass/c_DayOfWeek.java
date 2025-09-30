package T_CalenderClass;

import java.time.*;

public class c_DayOfWeek {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2015, 8, 5);
        DayOfWeek dow = date.getDayOfWeek();

        System.out.println("DayOfWeek: " + dow.name());   // MONDAY, TUESDAY, etc.
    }
}
