package test.save.com;

abstract class Anonymous {
    public abstract void show();

}
class TestAn{
    public static void main(String[] args) {
    Anonymous a=new Anonymous(){
        public void show(){
            System.out.println("hello how are you");
        }
    };
    a.show();
    }
    
}
