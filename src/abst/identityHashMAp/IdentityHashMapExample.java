package abst.identityHashMAp;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapExample {

    public static void main(String[] args) {
        Map hm = new HashMap<>();
//        hm.put(null, 2);
//        hm.put(1, null);
//        hm.put(2, null);
//        hm.put(3, 5);
//        System.out.println(hm);
      Map ihm= new IdentityHashMap<>();
      
      hm.put("test", "value");
      hm.put(new String("test"), "value1");
      
      ihm.put("1test", "value");
      ihm.put(new String("1test"), "value1");
      
      System.out.println("Size of HashMap--"+hm.size());
      
      //ihm.size() will print 2 since it compares the objects by reference
      System.out.println("Size of IdentityHashMap--"+ihm.size());
      
      
        
    }
}
