package company_oop1;
public class Company_oop1 {

    public static void main(String[] args) {
        Department d1= new Department(1,"Information Systems");
        
        Salaried_employee se = new Salaried_employee(2000, 500, 50, "Ahmed",  1200,"Riyadh", Gender.male);
        d1.add_Employee(se);
        
        Hourly_employee he = new Hourly_employee(100, 6, "Mohamed", 1500,"Kharj", Gender.male);
        
        d1.add_Employee(he);
        
        Commission_employee ce = new Commission_employee(15000, 0.25, "Fatema",  1200, "Riyadh", Gender.female);   
        d1.add_Employee(ce);
        
        System.out.println( d1.getemployeecount());
    
        // d1.print_basic_data();
        
        d1.print_All_details();
        
    }
    
}
