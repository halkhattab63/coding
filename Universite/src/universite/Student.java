package universite;

public class Student extends Person{
    private int student_level;
    private String specialization;
    private double GPA;

    public Student(String n, int a, String ad, String nat, int lvl, String sapc, double gpa) {
        super(n, a, ad, nat);
        student_level = lvl ;
        specialization = sapc;
        GPA = gpa;

    }
    Student (){}
    
    public void set_Student_level(int level){
        student_level = level;
    }
    
    public int get_student_level(){
        return student_level;
    }

    public void set_specialization(String spec){
        specialization = spec;
    }

    public String get_specialization(){
        return specialization;
    }

    public void set_GPA(double gpa){
        GPA = gpa;
    }

    public double get_GPA(){
        return GPA;
    }

    

}