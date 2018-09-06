package cuncurrent.map.test;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CHM {
public static void main(String[] args) {
    
    //The main reason that nulls aren't allowed in ConcurrentMaps (ConcurrentHashMaps, ConcurrentSkipListMaps)
    //because there will be ambiguities that may be just barely tolerable in non-concurrent maps can't be accommodated.

//The main one is that if map.get(key) returns null, you can't detect whether
    //the key explicitly maps to null vs the key isn't mapped
    Map cm= new ConcurrentHashMap<>();
    cm.put(null, null);
 //   cm.put(1, null);
  //  cm.put(null, 2);
    cm.put(2, 5);
    cm.put(3, 6);
    System.out.println(cm.size());
    System.out.println(cm);
    
}
}
