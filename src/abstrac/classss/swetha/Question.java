package abstrac.classss.swetha;

public class Question {
public void test(int a){
   
    try {
        int mod=(a/2)%2;
        int num=a/mod;
        System.out.println("HI 50"+a);
    } catch (Exception e) {
        // TODO Auto-generated catch block
        System.out.println("HI HO 40"+a);
    }
}
public static void main(String[] args) {
    Question c= new Question();
    c.test(41);
}
String s="abc";
}
