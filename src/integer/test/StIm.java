package integer.test;

public class StIm {
public static void main(String[] args) {
//    String s="ram";
//   s.concat("Syam");
//   System.out.println(s);
//   
//   StringBuffer s1=new StringBuffer("ram");
//   s1.append("Syam");
//   System.out.println(s1);
   
   //String t= "HI HOW ARE YOU";
    String s="ABCDEFGHI";
    System.out.println(s.length());
    int count=0;
  for(int i=0;i<s.length();i++){
      String res="";
     
      res=res+s.charAt(i);
      count++;
      System.out.println(res+ "" +count);
      
  }
    
}


}
