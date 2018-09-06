package test.clas.file;

import java.util.HashSet;

public class CommonElements {
public static void main(String[] args) {
    int [] a={1,2,5,7,9,10};
    int [] b={11,12,13,3,4,5,7};
    HashSet<Integer> set = new HashSet<Integer>();
    for(int i=0;i<a.length;i++)
    {
        for(int j=0;j<b.length;j++){
           if(a[i]==b[j]) {
               set.add(i);
           }
        }
    }
    System.out.println(set);  
}

/*String[] s1 = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR"};

String[] s2 = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR"};

HashSet<String> set = new HashSet<String>();

for (int i = 0; i < s1.length; i++)
{
    for (int j = 0; j < s2.length; j++)
    {
        if(s1[i].equals(s2[j]))
        {
            set.add(s1[i]);
        }
    }
}

System.out.println(set);     //OUTPUT : [THREE, FOUR, FIVE]
*/

}
