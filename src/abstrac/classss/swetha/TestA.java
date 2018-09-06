package abstrac.classss.swetha;

public class TestA {

    final int i;
    
    public TestA() {
        i=20;
     System.out.println("construtor testA"); 
    }
    
    {
        System.out.println("Instance block");
    }
    static {
        System.out.println("static block");  
    }
    
    public static void sm(){
        System.out.println("ststic method"); 
    }
    
    public void normal(){
        System.out.println("normal block");  
    }
    
    public static void main(String[] args) {
    //   TestA.sm();
        TestA obj= new TestA();
        obj.sm();
        obj.normal();
        
        //o/p 
    }
}
