package string.tutorial;

public class StringTest {
public static void main(String[] args) {
    
    // 
    String s="ram"; // string leteral
    String s1= new String("ram"); // string with new key words
    String s2="nam";
s=s+s2;
System.out.println(s);
System.out.println(s+12+"saty"+"122");

String a="hari";
String b="hari";
String c = new String("hari").intern();
String d="SHWETA";
System.out.println(a==b); //true
System.out.println(a==c);//false
System.out.println(a.equals(c));// true
System.out.println(a.toUpperCase());
System.out.println(s.substring(1, 2));
System.out.println(d.substring(1, 4));
String k="My name is George mori";
System.out.println(k.toLowerCase().replace("m", "q"));

System.out.println(d.replace("S", "Y"));

}
    
}
