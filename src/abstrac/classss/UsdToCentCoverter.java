package abstrac.classss;

import java.math.BigDecimal;

public class UsdToCentCoverter {
    public static void main(String[] args) {
    int a=    UsdToCentCoverter.usdToCents((BigDecimal.valueOf(1.23)));
       System.out.println(a);
     //   UsdToCentCoverter.centTOusd(BigDecimal.valueOf(110));
    }

   /* public static int usdToCents(BigDecimal usd) {
        return usd.movePointRight(2).intValueExact();
    }*/
    
    public static int usdToCents(BigDecimal usd) {
        if (usd.scale() > 2)
        {//more than 2dp
         //  thrown new InvalidUsdException(usd);
            System.out.println("can not exceed more than 2 "+usd);
        }// because was not supplied a billable USD amount
        BigDecimal bigDecimalInCents = usd.movePointRight(2);
        int cents = bigDecimalInCents.intValueExact();
        return cents;
    }
    
    public static void centTOusd(BigDecimal c){
        BigDecimal bigDecimalInCents=    c.movePointLeft(2);
        System.out.println("beging      ");
        System.out.println(bigDecimalInCents);
        System.out.println("test");
        
    }
}
