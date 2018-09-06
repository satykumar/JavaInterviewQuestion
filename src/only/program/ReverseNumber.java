package only.program;

public class ReverseNumber {
    
    public int reverseNumber(int number){
        
        int reverse = 0;
        while(number != 0){
            int rem=(number%10);
            reverse = (reverse*10)+rem; //12
            number = number/10;
        } 
        return reverse;
    }
     
    public static void main(String a[]){
        ReverseNumber nr = new ReverseNumber();
        System.out.println("Result: "+nr.reverseNumber(1223));
    }
}
