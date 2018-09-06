package remove.dulpilcate.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args){
        
        ArrayList<Object> al = new ArrayList<Object>();
        Set hs= new HashSet<>();
        al.add("java");
        al.add('a');
        al.add('b');
        al.add('a');
        al.add("java");
        al.add(10.3);
        al.add('c');
        al.add(14);
        al.add("java");
        al.add(12);
        
    System.out.println("Before Remove Duplicate elements:"+al);
     
    for(int i=0;i<al.size();i++){
     
     for(int j=i+1;j<al.size();j++){
                if(al.get(i).equals(al.get(j))){
                    al.remove(j);
                    j--;
                }
        }
     
     }
     
        System.out.println("After Removing duplicate elements:"+al);
        System.out.println("After Removing duplicate elements using collection");
        hs.add(al);
        System.out.println(hs);
            }
    


}
