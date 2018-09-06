package test.save.com;

public class Overload {
    
    public void m(Object o){
        System.out.println("Hi this is object");
    }
    
    public void m(String s)
    {
        System.out.println("HI this is string");
    }
    public void m(Integer i){
        System.out.println("integer number");
    }
    public void m(StringBuffer sb){
        System.out.println("String buffer");
    }
    public static void main(String[] args) {
        Overload over = new Overload();
        over.m(0);
        //over.m(null); CTE
        //over.m
    }

}
