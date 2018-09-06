package java8.test;

import java.util.HashMap;
import java.util.Map;

public class HashTestCustome {

    public static void main(String[] args) {
        Map<Task,String> hs= new HashMap<>();
        hs.put(new Task("test","value1"), "hari");
        hs.put(new Task("test1","value2"), "hari1");
        hs.put(new Task("test3","value4"), "hari2");
        hs.put(new Task("test4","value4"), "hari3");
       System.out.println("size of mapv  "+hs.size()); 
       hs.forEach((k,v)->System.out.println("Item : " + k + " Count : " + v));
       hs.forEach((k,v)-> System.out.println());
       
    }
}
