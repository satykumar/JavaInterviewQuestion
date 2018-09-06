package threa.basic;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class DemoCallableThread {
public static void main(String[] args) throws InterruptedException, ExecutionException {
    ExecutorService executorService= Executors.newFixedThreadPool(2);
    Callable<String> callable=()->{
        System.out.println("Entered Callable");
        Thread.sleep(2000);
        return "Hello from Callable";
    };
    System.out.println("Submitting Callable");
 
    Future<String> future =  executorService.submit(callable);
    System.out.println("Do something else while callable is getting executed");

    System.out.println("Retrieve the result of the future");
    // Future.get() blocks until the result is available
    String result = future.get();
    System.out.println(result);

    executorService.shutdown();
}
}
