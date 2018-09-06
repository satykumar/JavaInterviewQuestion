package stati.block;

public class Tricky {

        public static void main(String[] args) {
            System.out.println(Math.min(Double.MIN_VALUE, 0.0d));
            System.out.println(Math.min(Integer.MIN_VALUE, 0));
            System.out.println(Math.max(Double.MIN_VALUE, 0.0d));
            System.out.println("max value of integer");
            System.out.println(Math.max(Integer.MIN_VALUE, 0));
            try{
              double c= 1.0 / 0.0; 
              System.out.println(c);
              double c1= 1.0 / -0.0; 
              System.out.println(c1);
              double c2= -1.0 / 0.0; 
              System.out.println(c2);
            }
            catch(Exception e)
            {
              System.out.println(e.getMessage());  
            }
        System.out.println("test");
        }
    }

