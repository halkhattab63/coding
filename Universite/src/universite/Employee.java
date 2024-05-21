package universite;

public abstract class Employee extends Person{
    protected double salary;
    private int rank;
    private String jap;

    public Employee(String n, int a, String ad, String nat,double sal, int rak,String jp) {
        super(n, a, ad, nat);
        salary = sal;
        rank = rak;
        jap = jp;
    }

    
    public void set_salary(double sal) {
        salary = sal;
    }

    public void set_rank(int ran) {
        rank = ran;
    }

    public void set_jap(String jp) {
        jap = jp;
    }

    public abstract double get_salary() ;

    public int get_rank() {
        return rank;
    }

    public String get_jap() {
        return jap;
    }
}
