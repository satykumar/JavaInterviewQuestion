package java8.test;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IteratorTest {

    public static void main(String[] args) {
        Integer[] a = {1, 2, 3, 4};
        
        Integer myConstt= null;
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(3);
        list.add(null);
        System.out.println(list.size());
        //list.removeAll(Collections.singleton(null));
        System.out.println(list.size());
        ListIterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()) {
            if (myConstt.equals(iterator.next())) {
                iterator.remove();
            }
        }
        System.out.println(list);
        
    }

}


class myCla implements Runnable {

    @Override
    public void run() {
        // TODO Auto-generated method stub
        
    }
    
}
