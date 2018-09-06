package cuncurrent.map;

import java.util.Set;
import java.util.TreeSet;

public class SetTest {
public static void main(String[] args) {
    Set a= new TreeSet<>();
    Set b= new TreeSet<>();
    
    String s="ram";
    String s1= new String("ram");
    a.add(s);
    a.add(s1);
    
    int i=2;
    Integer i1=2;
    Integer i3= new Integer(2);
    b.add(i);
    b.add(i1);
    b.add(i3);
    b.add(i3);
    System.out.println(a.size()+""+b.size());
}
}
