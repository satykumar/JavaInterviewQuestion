package abstrac.classss.swetha;

import java.util.ArrayList;

public class TestList {
    public static void main(String[] args) {

//        List<Integer> al = new ArrayList();
//        al.add(1);
//        al.add(2);
//        al.add(3);
//        al.add(4);
//        al.add(5);
//
//        List<Integer> al1 = new ArrayList();
//        al1.add(1);
//        al1.add(22);
//        al1.add(3);
//        al1.add(44);
//        al1.add(5);
//
//        for (int i = 0; i < al.size(); i++) {
//
//            if (al.contains(al1.get(i))) {
//                System.out.println(al1.get(i));
//            }
//
//        }
///*al.set(3, 20);
//System.out.println(al);*/
//    }
        
        // create an empty array list with an initial capacity
        ArrayList<Integer> arrlist = new ArrayList<Integer>(8);

        // use add() method to add elements in the list
        arrlist.add(20);
        arrlist.add(25);
        arrlist.add(10);
        arrlist.add(15);  
//         arrlist.add(17);
//        arrlist.add(18);  
        
        ArrayList<Integer> arrlist1 = new ArrayList<Integer>(8);

        // use add() method to add elements in the list
        arrlist1.add(20);
        arrlist1.add(258);
        arrlist1.add(10);
        arrlist1.add(150);
        
         for(int i=0;i<4;i++)
         {
             if(arrlist.contains(arrlist1.get(i))){
             System.out.println(arrlist1.get(i));
             }
         }
    }

}
