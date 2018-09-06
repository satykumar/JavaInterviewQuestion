package threa.basic;

public class ThreadGroupDemo implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());  
        
    }
public static void main(String[] args) {
    ThreadGroup tg= new ThreadGroup("Parent ThreadGroup");
    ThreadGroupDemo runnable = new ThreadGroupDemo();
    Thread t1= new Thread(tg,runnable ,"test1");
    t1.start();
    Thread t2= new Thread(tg,runnable ,"test2");
    t2.start();
    Thread t3= new Thread(tg,runnable ,"test3");
    t3.start();
    System.out.println("Thread Group Name: "+tg.getName());  
    tg.list();  
}
}
