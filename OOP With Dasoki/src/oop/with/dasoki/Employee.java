package oop.with.dasoki;

public class Employee {
    private int emp_ID;
    private String name;
    private String depart;
    private double salary;
    private double bonus;
    private boolean resident;

    public Employee(){
        emp_ID = 2334;
        name = "Employee";
        depart = "Employ";
        salary = 234.4132;
        bonus = 1.0;
        resident = true;
    }

    Employee(int ID, String ne){
        emp_ID = ID;
        name = ne;
    }

    Employee(int ID, String ne , boolean res){
        this (ID, ne);
        resident = res;
    }

    public void setSalary(double sal){
        salary = sal;
    }

    public void setSalary(double sal, double bus) {
        this.setSalary(sal);
        bonus = bus;
    }

    public void setEmp_ID(int emp_ID) {
        this.emp_ID = emp_ID;
    }
    
    public void print_emp_Data(){
        System.out.println("emp_ID : "+emp_ID);
        System.out.println("name : "+name);
        System.out.println("depart : "+depart);
        System.out.println("Salary : "+salary);
        System.out.println("Bonus : "+ bonus);
        System.out.println("Resident : "+ resident);

    }
}
