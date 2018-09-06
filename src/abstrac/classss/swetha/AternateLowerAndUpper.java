package abstrac.classss.swetha;

public class AternateLowerAndUpper {
    
    public static void main(String[] args) {
     
        AternateLowerAndUpper.test("hihowareyou");
    }

    public static void test(String s){
        int len= s.length();
        
        for(int i=0;i<len;i++){
            char ch = s.charAt(i);
            if (i % 2 == 0) {
                System.out.print(Character.toLowerCase(ch));
            } else {
                System.out.print(Character.toUpperCase(ch));
            }
        }
    }
}
