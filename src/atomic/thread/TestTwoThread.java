package atomic.thread;

public class TestTwoThread {

    public static void main(String...args) throws InterruptedException{
        MyRunnable1 runnable=new MyRunnable1();
        Thread thread1=new Thread(runnable,"Thread-1");
        Thread thread2=new Thread(runnable,"Thread-2");
        thread1.start();
        thread2.start();
        
       // Thread.sleep(1000); //delay to ensure Thread-1 and Thread-2 finish
        System.out.println("After completion of both threads, "
                     );
 }
}

class MyRunnable1 implements Runnable{
    
    public void run(){
           for(int i=0;i<5;i++){
                  System.out.println("ThreadName="+Thread.currentThread().getName());
                             
           }          
           
    }
}