package interfac.test;

public class R implements P, Q{

    @Override
    public String methodQ() {
        // TODO Auto-generated method stub
        String p="asbc";
        return q+p;
    }

    @Override
    public String methodP() {
        // TODO Auto-generated method stub
        return p+q;
    }

    public static void main(String[] args) {
        R r = new R();
        
        System.out.println(r.methodP());
         
        System.out.println(r.methodQ());
    }
}
