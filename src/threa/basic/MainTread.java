package threa.basic;

public class MainTread {

    public static void main(String[] args) {
        
        A a= new A();
        a.start();
        for(int i=0;i<4;i++){
            System.out.println("main thread method"+i);
            }
                
    }
}
