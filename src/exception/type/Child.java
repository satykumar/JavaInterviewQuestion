package exception.type;

import java.io.IOException;

public class Child extends Parent{
public Child() {
    System.out.println("child constructor: ");
}

public void add(int a, int b){
    int c=0;
    c=a+b;
    System.out.println(c);
}

public void pt() throws IOException{
    System.out.println("child test class have exception");
}

void except() throws IOException{
    System.out.println("main test child");
}
}
