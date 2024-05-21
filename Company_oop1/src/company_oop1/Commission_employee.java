package company_oop1;

public class Commission_employee extends Employee implements Displayable{

    public double gross_sales;
    public double commission_rate;

    public Commission_employee() {
    }

    public Commission_employee(double gross_sales, double commission_rate) {
        this.gross_sales = gross_sales;
        this.commission_rate = commission_rate;
    }

    public Commission_employee(double gross_sales, double commission_rate, String name, int SSN, String address, Gender sex) {
        super(name, SSN, address, sex);
        this.gross_sales = gross_sales;
        this.commission_rate = commission_rate;
    }
    
    

    public void set_gross_sales(double gross_sales) {this.gross_sales = gross_sales;}

    public void set_commission_rate(double commission_rate) {this.commission_rate = commission_rate;}
    
    @Override
    public double earning() { return gross_sales*commission_rate; }

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
        return "Commission_employee{" + "gross_sales=" + gross_sales + ", commission_rate=" + commission_rate + '}';
    }
    
}
