package company_oop1;

import java.util.ArrayList;

public class Department {
    int dno;
    String name;
    ArrayList<Employee> employees;

    public Department() {
    }

    public Department(int dno, String name ) {
        this.dno = dno;
        this.name = name;
        employees = new ArrayList<Employee>();
    }

    public int getDno() {
        return dno;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setDno(int dno) {
        this.dno = dno;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getemployeecount(){
    return employees.size();
    }

    public void add_Employee(Employee e){ employees.add(e);}

    public void remove_Employee(Employee e){ employees.remove(e);}

    public void print_basic_data(){
        for (int i=0 ; i<employees.size();i++){
            System.out.println( employees.get(i).getSSN() + " " + employees.get(i).getName() + " " + employees.get(i).getSex());
        }
    }

    public void print_All_details(){
        for (int i=0 ; i<employees.size();i++){
            
            if (employees.get(i) instanceof Salaried_employee)
                ((Salaried_employee) employees.get(i)).displayable_detalis();
            if (employees.get(i) instanceof Hourly_employee)
                ((Hourly_employee)employees.get(i)).displayable_detalis();
            if (employees.get(i) instanceof Commission_employee)
                ((Commission_employee)employees.get(i)).displayable_detalis();
        }
    }

}
