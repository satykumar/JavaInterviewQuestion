package string.test;

public class ReverseString {
public static void main(String[] args) {
    String s="rama";
    for(int i=s.length()-1;i>=0;i--){
        String rev="";
         rev= rev+s.charAt(i);
         System.out.println(rev);
    }
}
}
