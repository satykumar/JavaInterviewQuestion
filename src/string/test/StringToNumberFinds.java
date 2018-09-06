package string.test;

public class StringToNumberFinds {
    public static void main(String[] args) {
        String s="saty123kum187";
        char c []= s.toCharArray();
        for(int i=0;i<=c.length;i++){
            try {
                int x = Integer.valueOf(String.valueOf(c[i]));
                System.out.println(x);
               
          } catch (Exception e) {
          }
   }
  
    }

}
