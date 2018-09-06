package only.program;

public class StringMethod {
public static void main(String[] args) {
    String a= new String("abc");
    
    String b="abc";
    String c="abc";
    String d= new String("abc").intern();
    
    System.out.println(a==d);
    System.out.println(b==d);
    String s="ram";
    String s1="sita";
    String s2="ra";
    String s3="msita";
  s2 =  s2.concat(s3);
  System.out.println(s2+"ram"+"naam"+"hari");
    System.out.println(s2);
    s3.toCharArray();
    
    String k="hariramsita";
    
   System.out.println(k.substring(2, 5));
    System.out.println(k.substring(6));
    
    String o= new String("tst");
    String o1= new String("tst");
    String o2= new String("tst2");
    String o3= new String("tst1");
    System.out.println(o==o1);
    System.out.println(o.equals(o1));
    System.out.println(o.hashCode()+"     "+ o1.hashCode());
   
    //
//    System.out.println(a==b); //false
//    System.out.println(b==c);//true
//    System.out.println(a==c);//false
//    System.out.println(a.equals(b));//true
//    System.out.println(b.equals(a));//true
//    System.out.println(a.hashCode());
//    System.out.println(b.hashCode());
//    System.out.println(c.hashCode());
}
}
