package abstrac.classss;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
public class TimeZoneConverter {
    public static void main(String[] args) {
//        LocalDateTime a = LocalDateTime.now();
//        LocalDateTime b = LocalDateTime.of(2014,12,21,10,20,30);
//        
//        System.out.println(a.toString());
//        System.out.println(b);
        
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.S", Locale.US);

            String text = "2011-02-18 05:00:00.0";
            LocalDateTime localDateTime = LocalDateTime.parse(text, formatter);
            LocalTime localTime = localDateTime.toLocalTime();
            System.out.println(localTime);
      }
}
