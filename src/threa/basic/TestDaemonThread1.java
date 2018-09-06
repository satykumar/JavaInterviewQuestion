package threa.basic;

public class TestDaemonThread1 extends Thread{
    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println("it is daemon thread");
        }
        else{  
            System.out.println("user thread work");  
           }  
    }
public static void main(String[] args) {
    TestDaemonThread1 t1=new TestDaemonThread1();
    TestDaemonThread1 t2=new TestDaemonThread1();
    TestDaemonThread1 t3=new TestDaemonThread1();
    t1.setDaemon(true);
    // daemon thres must be set before start the thread.
    t1.start();//starting threads  
    t2.start();  
    t3.start();  
    
}
}
