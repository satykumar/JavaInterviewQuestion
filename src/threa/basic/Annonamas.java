package threa.basic;

public class Annonamas {
public static void main(String[] args) {
    Thread t1= new Thread(){
        public void run(){  
            System.out.println("task one");  
          }  
    };
    t1.start();
}
}
