package relationships;

import java.util.List;

public class Employee {
    private int id;
    private float salary ;
    Personel_information  personelInfo;
    private List<Department> dept; // Assocation

    public Employee(int id, float salary, String firstName, String middeleName,
        String lastName, String bloodGroup, String accountNumber, String nationality, int yearOfBirth, List<Department> dept) {
        
        this.id = id;
        this.salary = salary;
        this.personelInfo = new Personel_information(firstName, middeleName, lastName, 
        bloodGroup, accountNumber, nationality, yearOfBirth);// Composition
        this.dept = dept;
    }

    public Employee(int id, float salary,List<Department> dept) {
        this.id = id;
        this.salary = salary;
        this.dept = dept; // Aggregation
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", salary=" + salary + ", personelInfo=" + personelInfo + ", dept=" + dept + '}';
    }

}
