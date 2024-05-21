package universite;

public abstract class Person {
    private String name;
    private int age;
    private String address;
    private String nationlity;

    public Person(String n, int a, String ad, String nat){
        name= n;
        age = a;
        address = ad;
        nationlity = nat;
    }

    Person(){}
    
    public void set_name(String nam) {
        name = nam;
    }

    public String get_name() {
        return name;
    }

    public void set_agr(int ag) {
        age = ag;
    }

    public int get_age() {
        return age;
    }

    public void set_address(String adrs) {
        address = adrs;
    }

    public String get_address() {
        return address;
    }

    public void set_nationlity(String ntion){
        nationlity = ntion;
    }

    public String get_nationlity() {
        return nationlity;
    }


}
