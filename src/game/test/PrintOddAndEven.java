package game.test;

public class PrintOddAndEven {
    static volatile  int counter = 1;
    static Object object = new Object();// Monitor

    public static void main(String[] args) {
        EvenProducer t1= new EvenProducer();
        OddProducer t2= new OddProducer();
     Thread tEven = new Thread(t1, "Even thread");
     Thread tOdd = new Thread(t2, "Odd thread");
     tEven.start();
     tOdd.start();
    }

    static class EvenProducer implements Runnable {
     public void run() {
      synchronized (object) {
       while (true) {
        if (counter % 2 == 0 && counter<20) {
         System.out.println(Thread.currentThread().getName()
           + " produced " + counter);
         try {
          Thread.sleep(1000);
         } catch (InterruptedException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
         }
         counter++;
         object.notify();
        } else {
         try {
          object.wait();
         } catch (InterruptedException e) {
          e.printStackTrace();
         }
        }
       }
      }
     }
    }

    static class OddProducer implements Runnable {
     public void run() {
      synchronized (object) {
       while (true) {
        if (counter % 2 != 0 && counter<20) {
         System.out.println(Thread.currentThread().getName()
           + " produced " + counter);
         counter++;
         object.notify();
        } else {
         try {
          object.wait();
         } catch (InterruptedException e) {
          e.printStackTrace();
         }
        }
       }
      }
     }
    }
}
