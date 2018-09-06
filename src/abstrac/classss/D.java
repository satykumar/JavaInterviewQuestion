package abstrac.classss;

public class D implements I{

    @Override
    public void add() {
       System.out.println("DDDDDDDDD"); 
    }

    @Override
    public void sub() {
        System.out.println("EEEEEEEEEEE");
    }
public static void main(String[] args) {
    D d= new D();
    d.add();
    d.sub();
}
}
