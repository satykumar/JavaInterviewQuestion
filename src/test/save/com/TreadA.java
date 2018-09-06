package test.save.com;

public class TreadA extends Thread{
    
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("testA");
        }
    }
public static void main(String[] args) {
    TreadA t= new TreadA();
    t.start();
    System.out.println("main thread");
    for(int i=0;i<3;i++){
        System.out.println("testB");
    }

}
}
