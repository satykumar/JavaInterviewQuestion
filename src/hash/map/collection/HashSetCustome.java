package hash.map.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashSetCustome {

    public static void main(String[] args) {
        Employee e= new Employee("test","test1",20L);
        Employee e1= new Employee("test1","test12",24L);
        Employee e2= new Employee("test2","test13",25L);
        Employee e3= new Employee("test3","test13",26L);
        Employee e4= new Employee("test","test1",20L);
        Set hs= new HashSet<Employee>();
        hs.add(e4);
        hs.add(e);
        hs.add(e1);
        hs.add(e2);
        hs.add(e3);
        System.out.println(hs.size());
     // if we return hashcode 10 and equals method  return true than size of hashset will be one
        //if we return hashcode 10 and equals method  return false than size of hashset will be five
        Map m= new HashMap<Employee,String>();
        m.put(e, "TEST");
        m.put(e1, "TEST");
        m.put(e2, "TEST");
        m.put(e3, null);
        m.put(e, "TEST");
        System.out.println(m.size());
        // if we return hashcode 10 and equals method  return true than size of hashMap will be one
       
        
        // if we return hashcode 10 and equals method  return false than size of hashMap will be five
    
    

        {
            System.out.println("abc".charAt(0));          //Output : a
     
            System.out.println("abc".equalsIgnoreCase("ABC"));      //Output : true
     
            System.out.println("abc".compareTo("abc"));         //Output : 0
     
            System.out.println("abc".indexOf('c'));        //Output : 2
        }
    
    }
    
}
