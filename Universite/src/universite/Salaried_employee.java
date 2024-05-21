package universite;

public class Salaried_employee extends Employee {
    private double bonus;
    private double deductions;

    
    Salaried_employee(String n, int a, String ad, String nat,double sal, int rak,String jp , double bns, double ded){
        super(n, a, ad, nat, sal, rak, jp);
        bonus = bns;
        deductions = ded;
    }
    @Override
    public double get_salary(){
        return salary + bonus - deductions;
    }
    public void set_Working_hours(double working_hours){
        bonus = working_hours;
    }

    public void set_houre_rate(double houre_rate){
        deductions = houre_rate;
    }

    public double get_working_hours(){
        return bonus;
    }

    public double get_houre_rate(){
        return deductions;
    }
    
}
