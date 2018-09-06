package threa.basic;

import java.util.concurrent.atomic.AtomicLong;

public class SubTask implements Runnable {
    AtomicLong al = null;
    SubTask(AtomicLong al){
     this.al = al;
    }
    
    @Override
    public void run() {
     System.out.println("Value - " + al.getAndIncrement() + " for " 
       + Thread.currentThread().getName()); 
    }
}


