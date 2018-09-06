package interfac.test;

public class IMain implements I1 ,I4{

    @Override
    public void test() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void key() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void save() {
        // TODO Auto-generated method stub
        
    }
@Override
    public void defaultMethod() {
        // TODO Auto-generated method stub
        I4.super.defaultMethod();
    }

public static void main(String[] args) {
    IMain Im= new IMain();   
    Im.defaultMethod();
}
}
