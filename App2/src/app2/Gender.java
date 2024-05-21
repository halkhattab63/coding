package app2;
import java.util.Scanner;

public class Gender {
    public void gender(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your gender :");
        String gender = scanner.nextLine();
        //  System.out.println("your gender :"+ gender);
        System.out.print("Enter your age :");
        int age = scanner.nextInt();

        scanner.close();
        // String gender = "male";
        // int age = 88 ; 

        if(gender.equals("male")){
            System.out.println("your gender is  male");
                    if(age <= 21  ){
                        System.out.println("he is a young boy");
                    }}
        
        else {
            System.out.println("your gender is female");
                    if (age <= 21 ) {
                        System.out.println("he is a young girl");
                    }}

}}
