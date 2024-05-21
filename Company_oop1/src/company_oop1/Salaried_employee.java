package company_oop1;

public class Salaried_employee extends Employee implements Displayable{

    private double salary ;
    private double bonus;
    private double deduction ;

    public Salaried_employee(double salary, double bonus, double deduction) {
        this.salary = salary;
        this.bonus = bonus;
        this.deduction = deduction;
    }

    public Salaried_employee(double salary, double bonus, double deduction, String name, int SSN, String address, Gender sex) {
        super(name, SSN, address, sex);
        this.salary = salary;
        this.bonus = bonus;
        this.deduction = deduction;
    }
    
    

    public void set_salary(double salary)  {this.salary = salary;}

    public void set_bonus(double bonus)  {this.bonus = bonus;}

    public void set_deduction(double deduction) {this.deduction = deduction;}

    @Override
    public double earning() {
        return salary + bonus - deduction;
    }

    @Override
    public void displayable_detalis() {
        System.out.println(super.toString());
        System.out.println(toString());
    }

    @Override
    public void display_earning() {
        System.out.println(earning());
    }

    @Override
    public String toString() {
        return "Salaried_employee{" + "salary=" + salary + ", bonus=" + bonus + ", deduction=" + deduction + '}';
    }

    
    
}
