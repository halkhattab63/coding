package relationships;
import java.util.List;

public class Relationships {

    public static void main(String[] args) {
        
        Employee employee = new Employee(12,2500,List.of(
            new Department(47,"It"),
            new Department(87,"comp")
        ));
        System.out.println(employee.toString());
    }
    
}
