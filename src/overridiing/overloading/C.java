package overridiing.overloading;

class C extends P {
public void testt(){
    System.out.println("child");
}
    
    
    public static void main(String[] args) {
       C c= new C();
       c.add();
       c.p11();
       P p= new P();
      // p.testt();
       
       
    }
}
