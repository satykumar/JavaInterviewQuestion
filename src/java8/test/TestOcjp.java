package java8.test;

public class TestOcjp {
    
//public static void main(String[] args) {
//    int a[] = {};
//      System.out.print(a instanceof Object); o/p true
    
    
    //----------
//    int a;
//    System.out.println(a instanceof Object); // compilation time error -Incompatible conditional operand types int and Object

    //-------------
    
//    static Integer i;
//        
//        public static void main(String [] args){
//            try{
//                System.out.println(i.compareTo(0));  
//            }catch ( ArithmeticException | NullPointerException e){ 
//                System.out.println("Exception"); 
//            } 
//        }  O/P Exception because Integer i defalut value is null so will get nullpointer exception
    
    /*public static void main(String[] args) {
               int a[] = { 1,2,053,4};
               int b[][] = { {1,2,4} , {2,2,1},{0,43,2}};
               System.out.print(a[3]==b[0][2] );
               System.out.print(" " + (a[2]==b[2][1]));
           }*/// O/p true,true
    
//    static int x = 0;   
//        public static void main(String[] args) {
//            for(int x=0;x<5;x++){   }
//            System.out.print(x);
//        } O/p 0
//  
   /* public static void main(String args[]){
                final int j;
                j=2;
                int x= 0;
            
                switch(x){
                    case 0: {System.out.print("A");}
                    case 1: System.out.print("B"); break;
                    case j: System.out.print("C");
                }
            }
    */ // o/p case expressions must be constant expressions compilation time error
    
    public static void main(String in[]){
                  int []ink= {1,2,3};
                  for(int x = 0;++x <4;x++)
                      System.out.print(in[x]);
              }
}

