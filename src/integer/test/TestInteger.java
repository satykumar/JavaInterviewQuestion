package integer.test;

public class TestInteger {
public static void main(String[] args) {
    Integer i=4;
    Integer k= new Integer(4);
    Integer k1= new Integer(4);
    int j=4;
    System.out.println(i==j);
    System.out.println(i.equals(j));
    System.out.println(k.equals(k1));
    System.out.println(k==k1);
    Integer i1= new Integer(127);
    Integer i2= new Integer(127);
    System.out.println(i1==i2);
    System.out.println(i1.equals(i2));
}
}
