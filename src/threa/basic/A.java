package threa.basic;

public class A extends Thread{
    
public void run(){
    for(int i=0;i<4;i++){
    System.out.println("Run thread method"+i);
    }
}
}
