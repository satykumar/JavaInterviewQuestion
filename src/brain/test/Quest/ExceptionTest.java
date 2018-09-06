package brain.test.Quest;

public class ExceptionTest {

    public static void main(String[] args) {
       /* 
        try{
            int a[]=new int[5];  
            a[5]=30/0;  
         // System.out.println(c);
        }
        catch(Exception e){
            System.out.println("catch");
            System.out.println(e);
        }
//        finally{
//            System.out.println("test");
//        }
 * 
 * 
*/  
        int marks[] = { 40, 50, 60 };
        System.out.println("Hello 1");
     
        try
        {
          int m1 = marks[3];                          
          System.out.println("Marks are " + m1);
        }
        catch(Exception e)
        {
          System.out.println("Do not cross size of array sir."  + e );
        }
        System.out.println("Hello 2");
        System.out.println("Hello 3");
          
    }
}
