package exceprtion.statica;

public class StackOverFlowErrorEx {
public static void main(String[] args) {
    StackOverFlowErrorEx error= new StackOverFlowErrorEx(); 
    error.m();
}
public void m(){
   // System.out.println("test");
    m1();
}
public void m1(){
    m();
}
}
