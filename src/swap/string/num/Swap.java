package swap.string.num;

public class Swap {
    public static void main(String[] args) {
        
        int a=20;
        int b=10;
         a=a+b;
         b=a-b;
         a=a-b;
         System.out.println("value of  "+a+" "+ b);
         String s="rama";
         String s1="man";
         s=s+s1;
       //  System.out.println(s.substring(beginIndex, endIndex));
        //
         
         s1 = s.substring(0, s.length()-s1.length());
         
         s = s.substring(s1.length());
//       s1=  s.substring(0, 4);
//       s=s.substring(3, s.length()-1);
       System.out.println("value of "+s +" " +s1);
       
         
    }

}
