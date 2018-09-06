package exceprtion.statica;

public class ExceptionHandlingInStaticBlock {
    public static void main(String[] args) {
        try {
             new A(); // It will throw java.lang.ExceptionInInitializerError
        } catch (Throwable error) {
             error.printStackTrace();
        }
    }
  }
   
  class A {
    static { // static block of class, which will throw RuntimeException
        System.out.println("In static block of class A");
        System.out.println(1 / 0); // It will throw java.lang.ArithmeticException
        
    }
   
    /* Constructor of class A will never get executed */
    A() {
         System.out.println("In constructor of class A");
    }
  
}
