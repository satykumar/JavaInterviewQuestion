package cuncurrent.map.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CHMM {
public static void main(String[] args) {
   /* List<Integer> al= new ArrayList();
    
    al.add(1);
    al.add(10);
    al.add(11);
    al.add(15);
    al.add(12);
    al.add(11);
    al.add(10);
    System.out.println(al);
    Iterator<Integer> itr=al.iterator();
    
    while(itr.hasNext()){
        if(al.equals(12)){
            itr.remove();
        }
 
    */
   
    String removeElem = "Perl";
    List<String> myList = new ArrayList<String>();
    myList.add("Java");
    myList.add("Unix");
    myList.add("Oracle");
    myList.add("C++");
    myList.add("Perl");
    System.out.println("Before remove:");
    System.out.println(myList);
    ListIterator<String> itr = myList.listIterator();
    while(itr.hasNext()){
        if(removeElem.equals(itr.next())){
            myList.remove("Perl");
        }
    }
    System.out.println("After remove:");
    System.out.println(myList);
}
}
