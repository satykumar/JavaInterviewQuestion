package abstrac.classss;

public class TestNull {
public static void main(String[] args) {
    TestNull tn= new TestNull();
    tn.test();
    
    
   
}
/*public void test(){
   String s="abcd";
   String s1=s;
   try{
   s1=null;
   System.out.println(s1.length());
   }
   catch(NullPointerException e)
   {
       System.out.println(e);
   }
   catch(ArithmeticException e)
   {
       System.out.println("test exception");
   }
   finally{
       System.out.println("test fianlly");
   }
   System.out.println("test test");
}*/

public int test(){
    try{
        System.out.println("abcd");
       int c=1/0;
        return 1;
       // System.out.println("abc");
    }
    catch(Exception e)
    {
     return 2;   
    }
    
    finally{
        System.out.println("3");
        return 4;
    }
}
}
