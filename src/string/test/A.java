package string.test;

public class A {
    public static void main(String[] args) {
        String s= "Hi Hello How Are You !";
        String a= new String("test");
        String b="test";
        String c="blank";
        String e= new String("test blank");
        b.concat(c);
        String d=null;
        System.out.println(a.equals(b));
        System.out.println(a==b);
        System.out.println(a==b.intern());
        System.out.println(a.intern()==b);
        System.out.println(e.equals(b.concat(a)));
        System.out.println(a+10+"ss");
        
    }

}
