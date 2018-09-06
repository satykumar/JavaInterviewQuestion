package abstrac.classss.swetha;

public class Child extends Parent {
    public Child() {
        super();
    }
    
    public Child(String s) {
        super("hari");
    }
    @Override
    public void test() {
       
       super.test();
       System.out.println("HI CHLID TEST");
    }
    
    public static void main(String[] args) {
        Child c= new Child();
        c.test();
        Child c1= new Child("Hi");
        c1.test();
    }

}
