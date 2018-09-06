package abstrac.classss.swetha;

public class OChild extends OParent {
    public void test() throws Exception{
        System.out.println("Hi test");
    }
public static void main(String[] args) throws Exception {
    OParent p= new OChild();
    p.test();
    Class.forName("oracle.jdbc.driver.OracleDriver");
}
}
