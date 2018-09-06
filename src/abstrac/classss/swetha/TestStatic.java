package abstrac.classss.swetha;

public class TestStatic {

    
    static{
        System.out.println("static block");
      
    }
    public TestStatic() {
       System.out.println("Hello construtor");
    }
    
    public static void test(){
        System.out.println("Hello static");
    }
    public void defatlttest(){
        System.out.println("normal method");
    }
    public static void main(String[] args) {
        TestStatic.test();
        TestStatic obj=new TestStatic();
        obj.defatlttest();
        
        
    }
}
