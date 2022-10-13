package TimeConversion;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;

public class TimeCoverter {
    public static void main(String[] args) throws ParseException {
        String time = "12:01:00 AM";
        DateFormat time2 = new SimpleDateFormat("hh:mm:ss aa");
        SimpleDateFormat timeformat = new SimpleDateFormat("HH:mm:ss");
        Date T = time2.parse(time);
        String output = timeformat.format(T);
        System.out.println(output);
    }
}
