package V_DateTime;

import java.time.LocalDateTime;

public class d_of {
    public static void main(String[] args) {

        LocalDateTime date1 = LocalDateTime.of(2024, 8,13, 0,8,6);
        System.out.println("Date 1: "+date1);

        LocalDateTime date2 = LocalDateTime.of(2025, 3,22, 0,0,0);
        System.out.println("Date 2: "+date2);

        if(date1.isBefore(date2)){
            System.out.println(date1 + " is earlier than "+date2);
        }
        else if(date1.isAfter(date2)){
            System.out.println(date2 + " is later than "+date1);
        }
        else if(date1.isEqual(date2)){
            System.out.println(date1+" is equals to "+date2);
        }
    }
}
