package algorithm;
import java.util.Scanner;

public class Algorithm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        /*************************operation************************ */
        // Sum_Odd_Numbers s = new Sum_Odd_Numbers();
        // s.sum_not_model();
        // System.out.println("------------------------------------");
        // s.sum_odd_model();
        // System.out.println("------------------------------------");
        // s.sum_even_model();
        // System.out.println("------------------------------------");
        // s.division();

        //*******************Nested_Loops****************************** */
        // Nested_Loops n = new Nested_Loops();
        // n.stars();
        // System.out.println("------------------------------------");
        // n.columns_number();
        // System.out.println("------------------------------------");
        // n.rows_number();
        // System.out.println("------------------------------------");
        // n.Ters_rows_numbers();
        // System.out.println("------------------------------------");
        // n.Symbols();
        // System.out.println("------------------------------------");
        // n.symbols1();
        /***********************Read********************************* */
        // Read r = new Read();
        // // r.user_Information();
        // r.sum();
        /************************Factorial************************************** */
        // Factorial f = new Factorial();
        // // f.sumFactorial();
        // // f.sum_sub_factorial();
        // f.factoria22222();

        /******************************Array***************************************** */
        // Array a = new Array();
        // a.example7();
        /*********************************matirx***************************************** */
        // Matrix A = new Matrix();
        // A.example10();
        /**************************************function********************************************* */
        // Function f = new Function();
        // double x;
        // double y;

        // System.out.print("Enter the first argument : ");
        // x = input.nextDouble();
        // System.out.print("Enter the second argument : ");
        // y = input.nextDouble();
        // f.sum(x,y);

        // int x;
        // int y;
        // System.out.print("Enter the first argument : ");
        // x = input.nextInt();
        // System.out.print("Enter the second argument : ");
        // y = input.nextInt();
        // System.out.println("the max is : " + f.maximum(x,y));
        
        // f.average();
        
        // double[] note = new double[5];
        // String[] methods = {"Algorithm", "Java", "Android", "Linux", "Networks"};

        // for (int i = 0; i <note.length ; i++) {
        //     do {
        //         System.out.print( methods[i] + " = ");
        //         note[i] = input.nextDouble();
        //     }while (note[i] <=0 || note[i] >= 20 );
        // }
        // System.out.println("-------------------------------------------------------");
        // f.average_update(note);   
        // int x ; 
        // int[] numbers = {1,2,3,4,5,6,7,8,9,10,3,4,5,3,4,5,7,6};
        // System.out.print("Find : ");
        // x = input.nextInt();
        // f.findFirst(numbers, x);
        // int x ; 
        // int[] numbers = {1,2,3,4,5,6,7,8,9,10,3,4,5,3,4,5,7,6};
        // System.out.print("Find : ");
        // x = input.nextInt();
        // f.findAll(numbers, x);
            /****************************Recursive Function******************************** */
            RecursiveFunction Rf = new RecursiveFunction();
            // Rf.countFromTo(1, 5);
            // Rf.countRecursively(5);
            System.out.println("factorial = "+ Rf.factorial(5));
            
input.close();        
    }
}