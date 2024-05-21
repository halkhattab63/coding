package oop.with.dasoki;


enum Gender { male, female};
enum Course {Database,computer,It,flutter};
enum Semester {ilkpahar,sonpahar,yaz};
public class RegisterForm {
    private String name;
    Gender stdGender;
    Course Course_name;
    Semester CrsSemester;

    public RegisterForm(){
        name = "Ahmed";
        stdGender = Gender.male;
        Course_name = Course.flutter;
        CrsSemester = Semester.ilkpahar;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    
}
