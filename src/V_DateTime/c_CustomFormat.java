package V_DateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class c_CustomFormat {
    public static void main(String[] args) {
        // LocalDateTime
        LocalDateTime datetime = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy  HH:mm:ss");
        String newDateTime = datetime.format(formatter);
        System.out.println(newDateTime);
    }
}
