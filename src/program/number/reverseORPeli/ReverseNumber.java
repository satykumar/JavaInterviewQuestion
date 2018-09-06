package program.number.reverseORPeli;

public class ReverseNumber {

    public static void main(String[] args) {
        ReverseNumber r= new ReverseNumber();
        
        System.out.println(r.reverse(123));
        
    }
    public  int reverse(int number)
    {
        int remider;
        int reverse=0;
        while(number!=0){
            remider=number%10;
            reverse = (reverse*10)+remider;
            number = number/10;
        }
        return reverse;
    }
}
//o/p=321