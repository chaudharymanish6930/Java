package T_CalenderClass;
import java.time.*;

public class b_LocalDate {
    public static void main(String[] args) {
        int day = 5, month = 8, year = 2015;

        LocalDate date = LocalDate.of(year, month, day);   // months are 1-based
        DayOfWeek dayOfWeek = date.getDayOfWeek();

        System.out.println("LocalDate: " + dayOfWeek);     // Already uppercase
    }
}
