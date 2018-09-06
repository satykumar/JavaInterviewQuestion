package interfac.test;

public interface I1 {

    void test();
    abstract void key();
    public void save();
    default void defaultMethod(){
        System.out.println("Hi i am InterfaceI3");
    }
    
    
}
