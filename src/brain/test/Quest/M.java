package brain.test.Quest;

import java.io.IOException;

public class M{ 
    
    void method()throws IOException{  
     throw new IOException("device error Test ");  
    }  
    
   
      public static void main(String args[]){//declare exception  
        M m=new M();  
      try{
          m.method();  
      }
      catch(IOException e){
          System.out.println("test  "+ e);
      }
     
       System.out.println("normal flow...");  
     }  
   }
