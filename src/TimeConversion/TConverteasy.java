package TimeConversion;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TConverteasy {
    public String timeconvert(String s){
        LocalTime parse = LocalTime.parse(s, DateTimeFormatter.ofPattern("hh:mm:ssa"));
        return  parse.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }
    public static void main(String[] args) {
        TConverteasy T = new TConverteasy();

        System.out.println(T.timeconvert("10:30:12pm"));

    }
}
