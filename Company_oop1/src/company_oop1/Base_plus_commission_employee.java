package company_oop1;

public class Base_plus_commission_employee extends Commission_employee implements Displayable{
    
    public double base;

    public void set_base(double base)  { this.base = base;}

    @Override
    public double earning(){return base + super.earning();}

    @Override
    public void displayable_detalis() {
        super.displayable_detalis();
        display_earning();
    }

    @Override
    public void display_earning() {
        System.out.println(earning());
    }


}
