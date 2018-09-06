package abstrac.classss.swetha;

public class ConstrotorA {
    
    String s;
    static String k;
public ConstrotorA() {


}

public static void main(String[] args) {
  ConstrotorA  c=new ConstrotorA();
    ConstrotorA.test();
    c.test();
}

public static void test(){
    System.out.println(k);
    System.out.println("hello");
}
}
