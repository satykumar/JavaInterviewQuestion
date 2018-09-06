package threa.basic;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService service =  Executors.newSingleThreadExecutor();
        SumTask sumTask = new SumTask(20);
        Future<A> future = service.submit(sumTask);
        A result = future.get();
        System.out.println(result);
    }
 }
 class SumTask implements Callable<A> {
     private int num = 0;
         public SumTask(int num){
             this.num = num;
         }
     @Override
     public A call() throws Exception {
         int result = 0;
         for(int i=1;i<=num;i++){
             result+=i;
         }
         return new A();
     }
}
