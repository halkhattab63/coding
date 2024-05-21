package oop.with.dasoki;
// import java.io.File;
// import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception1 {
    public void exception_example(){
        Scanner scanner = new Scanner(System.in);
        try{
            double x;
            double y;
            double s =0 ;
            System.out.print("enter a num : ");
            x = scanner.nextInt();
            System.out.print("enter a num again : ");
            y = scanner.nextInt();
            s = x/y;
            System.out.println("s = " + s);
        }
        catch(Exception e){
            System.out.println("the s in erorr"+e.getMessage());
        
        }
        scanner.close();
    }

    public void exception_example2(){
        try{
            
            // File file = new File("Myfile.txt");
            // ReadFile read=new ReadFile(file);
            // Scanner scanner = new Scanner(file);
            
            System.out.println();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    public void exception_example3(){
        String s ="svsv";
        try {
            int num = Integer.parseInt(s);
        System.out.println("num = " + num);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        
        try {
        Array array = new Array();
        array = null ; 
        array.hashCode();
        } catch (NullPointerException e) {
            System.out.println(e.hashCode());
        }
        
    }
}
