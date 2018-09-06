package brain.test.Quest;

public class Test {

/*public static void main(String[] args) {
    System.out.println("test");
   // Test.main(10);
    Test.main("abc");
    
}
public static void main(Integer i) {
    System.out.println("main+1");
}
public static void main(Object h) {
    System.out.println("main+Obj");
}*/
    
    public static void main(String args[]){
             /*  final int j=2;
             //  j=2;
               int y= 0;
           
               switch(y){
                   case 0: {System.out.print("A");}
                   case 1: System.out.print("B"); break;
                   case j: System.out.print("C");
               }*/
               
              /* int []in= {1,2,3};
               for(int x = 0;++x <4;x++)
                    System.out.print(in[x]);*/
        
       /* int x = (int)args[0];
                 System.out.print(x);*/ //complie time exception
        
             /*   int x = 10;
                  int y = x>10?1:x<10?-1:0;
                  System.out.println(y);*/
        
       /* List list = new ArrayList(1);
               list.add(5);
               list.add("A");
              list.add(new Integer(5));
               System.out.print(list);
           }*/
    
        
      
           
             try { test(); }
             catch (Exception ex) { System.out.print("exception "); }
             System.out.print("end ");

        
    }
             static void test() throws Error {
                 if (true) throw new AssertionError();
                 System.out.print("test ");
                 }
}
