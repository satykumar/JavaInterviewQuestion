package test.save.com;

public class Parent {
    int a=50;
    public void m(){
        System.out.println("parent : M");
    }
    protected void m2(){
        System.out.println("Parent PRotected :M2");
    }
    private void m3(){
        System.out.println("private m3:");
    }

    void m4()
    {
        System.out.println("Default parent : m4");
    }
    protected static void m5(){
        System.out.println("Parent PRotected :M5");
    }
    
    protected  void m6(){
        System.out.println("Parent PRotected :M6");
    }
    
   public void test(){
       System.out.println("HI I am test of Parent");
   }
   
   public void test1(){
       System.out.println("HI I am test1 of Parent");
   }
   
   public void test2(){
       System.out.println("HI I am test2 of Parent");
   }
   
    
}
