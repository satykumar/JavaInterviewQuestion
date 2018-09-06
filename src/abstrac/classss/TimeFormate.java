package abstrac.classss;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Date;

public class TimeFormate {

    public static void main(String[] args) {
        
        //System.out.println(Instant.now().range(19));
        Instant i= Instant.now();
        
    //   Instant i2="2018-08-30T10:42:24.244Z";
      // String i = Instant.now().toString();
       System.out.println(i);
       LocalDateTime d = LocalDateTime.now();
       //System.out.println(LocalDateTime.parse((Instant.now().toString())));
    //   i = i.substring(0,19)+".00Z";
    //   Instant ts=  Instant.parse(i);
      // System.out.println(ts);
       String t= Instant.now().toString();
       Instant   instant = Instant.parse(t); 
       System.out.println("----"+ instant);
       System.out.println(t.substring(0,19));
        System.out.println(LocalDateTime.ofInstant(Instant.now(), ZoneOffset.MAX));
        Date myDate = Date.from(Instant.now());
        System.out.println(myDate);
        
        
    }
}
