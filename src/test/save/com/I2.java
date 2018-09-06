package test.save.com;

public interface I2 {
    public static void m(){
        System.out.println("test i2");
    }
   /* default void md(){
        System.out.println("static test i2");
    }
*/    default void mds(){
        System.out.println("static void main");
    }
}
