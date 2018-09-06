package ocuurance.word;

public class ReverseEachWordsOfString {
    public static void main(String[] args) {
        String s = "HI HOW ARE YOU AND HOW IS GOINH LIFE";
        String sl[] = s.split(" ");
        String reverseString = "";
       // char c[] = s.toCharArray();
        // System.out.println(s.);
        for (int i = 0; i <= sl.length; i++) {
            String reverse = sl[i];
            String result = "";
            for (int j = reverse.length() - 1; j >= 0; j--) {
                result = result + reverse.charAt(j);
            }
            reverseString = reverseString + result + " ";
            System.out.println(reverseString);
        }
        
    }
}
