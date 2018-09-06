package string.test;

public class FindSumOfAllEvenDigitInString {
    
    public static void main(String[] args) {
        
        String s = "java1 grey2473";
       
        //String s = "java64 is12"; //Test string
        char ch[] = s.toCharArray();
        int sum = 0;

        for (int i = 0; i < ch.length; i++) {
               try {
                     int x = Integer.valueOf(String.valueOf(ch[i]));
                     if (x % 2!= 0) {
                            sum += x;
                     }
               } catch (Exception e) {
               }
        }
        System.out.println(sum);
 }
}
