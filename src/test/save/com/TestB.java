package test.save.com;

public class TestB {
    /*public static void main(String[] args) {
        
    
      Set s = new HashSet();
      
        TestA a= new TestA();
        System.out.println(a.c);
        
        TestA.B aa = new TestA.B();
               System.out.println(aa.a); 
               System.out.println(new TestA.B());
    }*/
    
    public void call(){
        System.out.println("hi");
    }
    public static void main(String[] args) {
        TestB b= new TestB(){
          public void call(){
              System.out.println("JIII");
          }
        };
        TestB b1= new TestB();
        b1.call();
        b.call();
        
    }

}
