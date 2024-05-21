package company_oop1;

public class Hourly_employee extends Employee implements Displayable{

    private double houre_rate ;
    private double number_of_hours ;

    public Hourly_employee() {
    }

    public Hourly_employee(double houre_rate, double number_of_hours) {
        this.houre_rate = houre_rate;
        this.number_of_hours = number_of_hours;
    }

    public Hourly_employee(double houre_rate, double number_of_hours, String name, int SSN, String address, Gender sex) {
        super(name, SSN, address, sex);
        this.houre_rate = houre_rate;
        this.number_of_hours = number_of_hours;
    }
    
    

    public void set_HoureRate(double houre_rate)  { this.houre_rate = houre_rate; }

    public void set_number_of_hours(double number_of_hours)  { this.number_of_hours = number_of_hours; }

    @Override 
    public double earning()   { return houre_rate * number_of_hours; }

    @Override
    public void displayable_detalis() {
        System.out.println(super.toString());
        System.out.println(toString());
        display_earning();
    }

    @Override
    public void display_earning() {
        System.out.println(earning());
    }

    @Override
    public String toString() {
        return "Hourly_employee{" + "houre_rate=" + houre_rate + ", number_of_hours=" + number_of_hours + '}';
    }


}
