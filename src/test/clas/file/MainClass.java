package test.clas.file;

public class MainClass {

//  
    int i = 10;
    
    static MainClass t;
 
    public static void main(String[] args)
    {
        System.out.println(MainClass.t.t.t.t.t.t.i);
    }
}