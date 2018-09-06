package test.save.com;

public class Java8Test implements Iint8 {
  
   public void add(){
       Iint8.super.add();
        System.out.println("Hi test");
        
        
    }
   public static void main(String[] args) {
       Iint8 i= new Java8Test();
       i.add();
       
       
       //Iint8.super.add();
 }
}
