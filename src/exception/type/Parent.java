package exception.type;

import java.io.IOException;

public class Parent {

    public Parent() {
        System.out.println("Parent constructor: ");
    }
    
    public void add(int a, int b) throws Exception{
        int c=0;
        c=a+b;
        System.out.println(c);
    }
    
    public void pt() throws IOException{
        System.out.println("parent test class have exception");
    }
    
    void except() throws IOException{
        System.out.println("main test");
    }
}

