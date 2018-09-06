package design.pattern.observer;

public class ObserverEverydayDemo {
public static void main(String[] args) {
    Subject subject= new MessageStream();
    PhoneClient phoneClient =new PhoneClient(subject);
    phoneClient.addMessage("Here is a new message");
}
}
