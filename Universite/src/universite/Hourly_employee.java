package universite;

import java.sql.Date;

public class Hourly_employee extends Employee {
    private Date working_hours; 
    private Date houre_rate;

    Hourly_employee(String n, int a, String ad, String nat,double sal, int rak,String jp , Date worDate, Date rateDate){
        super(n, a, ad, nat, sal, rak, jp);
        working_hours =  worDate;
        houre_rate = rateDate;
    }
    public void set_Working_hours(Date working){
        working_hours = working;
    }

    public void set_houre_rate(Date rate){
        houre_rate = rate;
    }

    public Date get_working_hours(){
        return working_hours;
    }

    public Date get_houre_rate(){
        return houre_rate;
    }
    @Override
    
    public double get_salary() {
        return 0 ;
    }
}
