package test.save.com;


class Audi extends Car {
    public Audi() {
        System.out.println("Hi 2");
    }
    
    {
        System.out.println("Init 1");
    }
    final static void test1(){
        System.out.println("final 1");
    }
    static{
        System.out.println("static block2");  
    }
    public void m2(){
        System.out.println("protected 2");
    }
    private void m(){
        System.out.println("M 2");
    }
    static void m3(){
        System.out.println("Static 2");
    }
    
void run()
{
System.out.println("Audi is running safely with 100km");
}
public static void main(String args[])
{
Car b= new Audi();    //upcasting
b.run();
b.m2();
//b.m();
b.m3();
}
}
