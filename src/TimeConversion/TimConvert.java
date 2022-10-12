package TimeConversion;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimConvert {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.println(time);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("mm:HH:ss");
    }
}
