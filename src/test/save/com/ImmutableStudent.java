package test.save.com;

public final class ImmutableStudent {
    private final int id;
    private final String name;
    private final Age age;
   // private Date date;
    public ImmutableStudent(int id, String name, Age age) {
        this.name = name;
        this.id = id;
        Age cloneAge = new Age();
        cloneAge.setDay(age.getDay());
        cloneAge.setMonth(age.getMonth());
        cloneAge.setYear(age.getYear());
        this.age = cloneAge;
       // this.date=date;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    
    public Age getAge() {
        return age;
    }
    /*public Date getDate() {
        return date;
    }*/
    
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Age age = new Age();
        age.setDay(1);
        age.setMonth(1);
        age.setYear(1992);
        ImmutableStudent student = new ImmutableStudent(1, "Alex", age);
        //student.date=new Date("aste Feb 02 16:45:07 IST 2018");
        System.out.println("Alex age year before modification = " + student.getAge().getYear());
        age.setYear(1993);
        //System.out.println(student.getDate());
        
        System.out.println("Alex age year after modification = " + student.getAge().getYear());
       // System.out.println(student.getDate());
    }
   
 
}