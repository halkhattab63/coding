package test_with_ahmed;


public class Borrowing {
    public Student students[]= new Student[3];
    public Books books[];
    protected int id; 
    public String bookname ;


    public Borrowing(Student[] students,Books[] books) {
        this.students = students;
        this.books = books;
    }
}
