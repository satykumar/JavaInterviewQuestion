package abstrac.classss;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TestDateExjample1 {

    public static void main(String[] argv) {

       /* SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
        String dateInString = "7-Jun-2013";

        try {

            Date date = formatter.parse(dateInString);
            System.out.println(date);
            System.out.println(formatter.format(date));

        } catch (ParseException e) {
            e.printStackTrace();
        }*/
        
     //   --------------------------------------
        //Incrementing the date by 1 day
      /*  String oldDate = "2017-01-29";  
        System.out.println("Date before Addition: "+oldDate);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();
        try{
           c.setTime(sdf.parse(oldDate));
        }catch(ParseException e){
           e.printStackTrace();
         }
        //Incrementing the date by 1 day
        c.add(Calendar.DAY_OF_MONTH, 1);  
        String newDate = sdf.format(c.getTime());  
        System.out.println("Date Incremented by One: "+newDate);
        
*/
     //   ----calculating the days between them
        String dateBeforeString = "2017-05-24";
        String dateAfterString = "2017-07-29";
            
        //Parsing the date
        LocalDate dateBefore = LocalDate.parse(dateBeforeString);
        LocalDate dateAfter = LocalDate.parse(dateAfterString);
            
        //calculating number of days in between
        long noOfDaysBetween = ChronoUnit.DAYS.between(dateBefore, dateAfter);
            
        //displaying the number of days
        System.out.println(noOfDaysBetween);
        
    }
}
