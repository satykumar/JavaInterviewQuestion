package clone.objects;

public class CloningInJava {
    public static void main(String args[]){
        EmployeeAddress empAddress=new EmployeeAddress("22","Avenue Street", "Dallas");
        Employee emp=new Employee("David", 32,empAddress);
        Employee empClone=null;
        try {
          empClone=(Employee) emp.clone();
        }catch(CloneNotSupportedException cnse){
          cnse.printStackTrace();
        }
     
        System.out.println("Cloned Employee Object: "+empClone);
      }
}
