package abstrac.classss;

import java.util.Collections;
import java.util.Map;

public class CollectionsDemo {

    public static void main(String[] a) {
        
        // create singleton map
        Map map = Collections.singletonMap("key","Value");
        map.put("key:", "value");

        System.out.println("Singleton map is: "+map);
        System.out.println();
}
}
