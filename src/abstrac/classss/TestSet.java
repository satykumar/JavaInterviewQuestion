package abstrac.classss;

import java.util.ArrayList;
import java.util.HashSet;

public class TestSet {
public static void main(String[] args) {
    
    HashSet<Integer> hs= new HashSet();
    hs.add(1);
    hs.add(11);
    hs.add(10);
    hs.add(14);
    hs.add(13);
    hs.add(1);
    hs.add(11);
    hs.add(19);
    hs.add(14);
    
    HashSet<Integer> hs1= new HashSet();
    hs1.add(21);
    hs1.add(11);
    hs1.add(10);
    hs1.add(24);
    hs1.add(13);
    hs1.add(2);
    hs1.add(11);
    hs1.add(29);
    hs1.add(14);
   
/* System.out.println(hs);
 
 for (Integer abc : hs) {
     System.out.println(abc);
    
}
 Iterator itr= hs.iterator();
 while(itr.hasNext()){
     System.out.println(itr.next());
 }
 */
/* System.out.println(hs.size());
 
 System.out.println(hs.isEmpty());
 System.out.println(hs1);*/
 System.out.println( hs.addAll(hs1));
 System.out.println(hs);
 hs.remove(29);
// hs.removeAll(hs1);
 //System.out.println(hs);
 //hs.clear();
 HashSet<Integer> clonedSet = new HashSet();  
 //Clone the HashSet  
 clonedSet= (HashSet)hs.clone();
// clonedSet = (HashSet)set.clone(); 
 System.out.println(clonedSet);
 System.out.println(hs);
 
 ArrayList al = new ArrayList(hs);
 System.out.println(al);
  Object[] a = hs.toArray();
  System.out.println(a);
 
  String s = new String();
  
 
    
}
}
