package design.pattern;

import java.util.Observable;
import java.util.Observer;

public class ObesrverEveryDayDemo {
public static void main(String[] args) {
    TwiterStream twiterStream = new TwiterStream();
    Client client1= new Client("HIIIIIIII");
    Client client2= new Client("HOWWWWWWWWWWWWWW");
    twiterStream.addObserver(client1);
    twiterStream.addObserver(client2);
    twiterStream.someOnetwite();
    
    
}
}

//Concrete subject
class TwiterStream extends Observable{

public void someOnetwite(){
    setChanged();
    notifyObservers();
}
   
    
    
}
//Concrete objeserver
class Client implements Observer{

    private String name;
    public Client(String name) {
        this.name=name;
    }
    @Override
    public void update(Observable o, Object arg) {
       System.out.println("Update "+ name +" s, strream");
        
    }
    
}