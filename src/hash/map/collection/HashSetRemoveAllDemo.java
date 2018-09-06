package hash.map.collection;

import java.util.HashSet;
import java.util.LinkedList;

public class HashSetRemoveAllDemo {
    public static void main(String s[])
    {
        HashSet<Integer> original = new HashSet<>();
        for(int i=1; i<=10; i++)
        {
            original.add(i);
        }
 
        HashSet<Integer> removalSet = new HashSet<>();
        for(int i=7; i<=12; i++)
        {
            removalSet.add(i);
        }
 
        LinkedList<Integer> removalList = new LinkedList<>();
        for(int i=-3; i<=2; i++)
        {
            removalList.add(i);
        }
 
        System.out.println("Original : " + original);
        System.out.println("RemovalSet : " + removalSet);
        System.out.println("RemovalList : " + removalList);
 
        // removes 7,8,9,10 from original set
        original.removeAll(removalSet);
        System.out.println("After removing elements of RemovalSet : " + original);
 
        // removes 1,2 from original set
        original.removeAll(removalList);
        System.out.println("After removing elements of RemovalList : " + original);
    }
}
