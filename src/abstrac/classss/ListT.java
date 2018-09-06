package abstrac.classss;

import java.util.ArrayList;
import java.util.Iterator;

public class ListT {

    public static void main(String[] args) {
//        ArrayList s= new ArrayList<>();
//        s.add(1);
//        s.add(2);
//        s.add("test");
//        s.add("abc");
//        s.add("kkk");
//        s.add(7);
//        
//        System.out.println(s);
//        
//        ArrayList<String>al= new ArrayList<>();
//        al.add("sita");
//        al.add("gita");
//        al.add("rita");
//        al.add("kita");
//        al.add("fita");
//        al.add("oita");
//       // al.add(1);
//        System.out.println(al);
        
        ArrayList<Integer> an= new ArrayList<>();
        an.add(1);
        an.add(10);
        an.add(20);
        an.add(30);
        an.add(40);
       // an.add("satynedra");
       // System.out.println(an);
        
        Iterator<Integer> itr=an.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
            
        }
    }
}
