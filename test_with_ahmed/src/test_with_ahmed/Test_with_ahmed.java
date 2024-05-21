/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_with_ahmed;

/**
 *
 * @author HAYYAN ALKHATTAB
 */
public class Test_with_ahmed {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Student student[] = {new Student()};
        Books books[] = {new Books()};
        Borrowing borr=new Borrowing(student,books);
        borr.students[0].year="d";
        Student std = new Student();
        std.year = "d";
        System.out.println(std.year);

    }
    
}
