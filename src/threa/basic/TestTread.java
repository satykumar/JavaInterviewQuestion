package threa.basic;

public class TestTread extends Thread {

  public  void run(){
      System.out.println("ABCD Testing Thread" +Thread.currentThread().getName());
    }
   public static void main(String[] args) {
       TestTread t= new TestTread();
       TestTread t1= new TestTread();
       TestTread t3= new TestTread();
       TestTread t2= new TestTread();
     //  System.out.println(t.getName());
       t.setPriority(10);
       t1.setPriority(10);
       t2.setPriority(10);
       t3.setPriority(10);
       System.out.println("test1"+t.getName());
       t3.start();
       System.out.println("test2"+t.getName());
       t1.start();
       System.out.println("test3"+t.getName());
       t2.start();
       System.out.println("test4"+t.getName());
       t.start();
}
}
