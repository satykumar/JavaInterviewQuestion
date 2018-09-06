package abstrac.classss;

public class TestB extends TestA{
    public void print(){
        System.out.println("AS");
        super.print();
        }
    
    public static void main(String[] args) {
        TestA a= new TestB();
        a.print();
        
    }
}
