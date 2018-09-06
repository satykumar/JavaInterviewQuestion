package abstrac.classss.swetha;

public class Parent {
    private String s;
    public Parent() {
        System.out.println("Hello defalut");
    }

    public Parent(String s2) {
        this.s=s2;
        System.out.println("Hello argument");
    }
    public void test(){
        System.out.println("Hello test");
    }
}
