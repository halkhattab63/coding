package relationships;

public class Personel_information {
    private String firstName;
    private String middeleName;
    private String lastName;
    private String bloodGroup ;
    private String accountNumber ;
    private String nationality;
    private int yearOfBirth;

    public Personel_information() {
    }

    public Personel_information(String firstName, String middeleName, 
    String lastName, String bloodGroup, String accountNumber,
    String nationality, int yearOfBirth) {
        
        this.firstName = firstName;
        this.middeleName = middeleName;
        this.lastName = lastName;
        this.bloodGroup = bloodGroup;
        this.accountNumber = accountNumber;
        this.nationality = nationality;
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public String toString() {
        return "Personel_information{" + "firstName=" + firstName + ", middeleName=" + middeleName + ", lastName=" + lastName + ", bloodGroup=" + bloodGroup + ", accountNumber=" + accountNumber + ", nationality=" + nationality + ", yearOfBirth=" + yearOfBirth + '}';
    }
    
    
}
