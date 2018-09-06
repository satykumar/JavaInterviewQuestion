package string.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StringDividedBysomeDigit {
    
    List<String> methodDividesStringAndReturnList(int n) {
        String s="satyendrakumar";
        //String s = "abcdefgh"; //Test String
        //String s = "abcdefghij"; //Test String
        char ch[] = s.toCharArray();
        int ctr = 0;
        List<String> l = new ArrayList<String>();
        String temp = "";

        for (int i = 0; i < ch.length; i++) {
               if (ctr < n) {
                     temp += String.valueOf(ch[i]);
                     ctr++;
               }

               if (ctr == n || i == ch.length - 1) {
                     l.add(temp);
                     temp = "";
                     ctr = 0;
               }
        }

        return l;
 }

 public static void main(String[] args) {
     StringDividedBysomeDigit o = new StringDividedBysomeDigit();
        List<String> l = o.methodDividesStringAndReturnList(3);

        // Display list
        Iterator<String> it = l.iterator();
        while (it.hasNext()) {
               System.out.println(it.next());

        }
 }

}
