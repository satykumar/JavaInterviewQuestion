package abstrac.classss.swetha;

import java.util.ArrayList;
import java.util.List;

public class DulpicateFromList {
public static void main(String[] args) {
    
    List<Integer> al= new ArrayList();
    al.add(1);
    al.add(2);
    al.add(3);
    al.add(4);
    al.add(5);
    
    List<Integer> al1= new ArrayList();
    al1.add(1);
    al1.add(22);
    al1.add(3);
    al1.add(44);
    al1.add(5);
    for(int i=0;i<al.size();i++){
        
 
        
        for(int j=0;j<al1.size();j++){
                   if(al.get(i).equals(al1.get(j))){
                       al.remove(j);
                       j--;
                   }
           }
        
        }
    
}
}
