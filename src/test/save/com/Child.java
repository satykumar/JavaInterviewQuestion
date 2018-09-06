package test.save.com;

public class Child extends Parent{
  int a=60;
    public void m(){
        System.out.println("Child : M");
    }

public void m2(){
    System.out.println("Child PRotected :M2");
}
private void m3(){
    System.out.println("Child m3:");
}
public void m4()
{
    System.out.println("Default Child : m4");
}
protected static void m5(){
    System.out.println("Child PRotected :M5");
}

protected static void m7(){
    System.out.println("Child PRotected :M7");
}

public void basic(){
    System.out.println("Child basic");
}
public static void main(String[] args) {
    Parent p= new Child();
    System.out.println(p.a);
   p.m();
   p.m2();
   p.m4();
  p.m5();
  ((Child) p).basic();
  
 /* Child c= new Child();
  c.m3();
  c.m6();
 System.out.println( c.a);
 
 Parent p1= new Parent();*/
  Child c= new Child();
  c.test();
  c.test1();
}




}
