package company_oop1;

enum Gender { male , female};
public abstract class Employee {

    private String name ;
    private int SSN ;
    String address;
    Gender sex ;
    
    public Employee(){};

    public Employee(String name, int SSN, String address, Gender sex) {
        this.name = name;
        this.SSN = SSN;
        this.address = address;
        this.sex = sex;
    }
    
    

    public void setName(String name) {this.name = name;}

    public void setSSN(int SSN) {this.SSN = SSN;}

    public String getName() {return name;}

    public int getSSN() {return SSN;}

    public Gender getSex() {
        return sex;
    }

    

    public abstract double earning();

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", SSN=" + SSN + ", address=" + address + ", sex=" + sex + '}';
    }

    
    
}
