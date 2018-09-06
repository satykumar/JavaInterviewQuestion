package interfac.test;

public class IClassA implements I2,I3{

    @Override
    public void defaultMethod() {
      I2.super.defaultMethod();
        System.out.println("this is tesing stage");
    }
public static void main(String[] args) {
    IClassA c= new IClassA();
    c.defaultMethod();
}
}
