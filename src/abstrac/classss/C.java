package abstrac.classss;

public class C implements I {

    @Override
    public void add() {
       System.out.println("aaaaaaaaaaaaaa"); 
    }

    @Override
    public void sub() {
       System.out.println("ssssssssssssssssss"); 
    }
public static void main(String[] args) {
    C c= new C();
    c.add();
    c.sub();
}
}
