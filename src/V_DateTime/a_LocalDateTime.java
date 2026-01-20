package V_DateTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class a_LocalDateTime {
    public static void main(String[] args){

        LocalDate date = LocalDate.now();
        System.out.println("Local Date :"+date);

        LocalTime time = LocalTime.now();
        System.out.println("Local Time :"+time);

        LocalDateTime loacldt = LocalDateTime.now();
        System.out.println(loacldt);
    }
}
