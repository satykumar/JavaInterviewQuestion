package threa.basic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;

public class AtomicLongDemo {
public static void main(String[] args) {
    AtomicLong al = new AtomicLong();
    ExecutorService eService= Executors.newFixedThreadPool(2);
    eService.submit(new SubTask(al));
    eService.submit(new SubTask(al));
    eService.submit(new SubTask(al));
    eService.submit(new SubTask(al));
    eService.shutdown();
}
}
