package string.test;

public class TestRun implements Runnable{

    @Override
    public void run() {
        System.out.println("run.");
    //  throw new RuntimeException("Problem");

        
    }
public static void main(String[] args) {
    Thread t = new Thread(new TestRun());
    t.run();
    t.run();
    t.start();
 
     System.out.println("End of method.");

}
}
