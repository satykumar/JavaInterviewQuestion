package generic.type;

public class Generic<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
    
    public static void main(String[] args) {
        Generic<Integer> gInt= new  Generic<Integer>();
        Generic<String> gStr= new  Generic<String>();
        Generic<Float> gflot= new  Generic<Float>();
        gInt.setT(10);
        gStr.setT("A");
        gflot.setT(101f);
        System.out.println("integer value "+gInt.getT() +" String value " +gStr.getT() +" Float value "+gflot.getT());
    }

}
