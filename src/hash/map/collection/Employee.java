package hash.map.collection;

public class Employee {

    String name;
    String lname;
    Long age;
    
    public Employee(String name, String lname, Long age) {
        super();
        this.name = name;
        this.lname = lname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", lname=" + lname + ", age=" + age + "]";
    }

   /* @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((age == null) ? 0 : age.hashCode());
        result = prime * result + ((lname == null) ? 0 : lname.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if (age == null) {
            if (other.age != null)
                return false;
        } else if (!age.equals(other.age))
            return false;
        if (lname == null) {
            if (other.lname != null)
                return false;
        } else if (!lname.equals(other.lname))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }*/
  
    public int hashCode(){
        return 10;
    }
    public boolean equals(Object obj){
        return true; // return size one
        
        // if return false than it will give size of element as we have added no of element.
    }
}
