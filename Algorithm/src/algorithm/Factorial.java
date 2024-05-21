package algorithm;
import java.util.Scanner;
public class Factorial {
    public void sumFactorial(){
        Scanner scan = new Scanner(System.in);

        int sum = 0;
        int fak;
        int N;

        System.out.println("enter a last factorial");
        N = scan.nextInt();
        for (int i = 1; i <= N; i++) {
            fak = 1 ;
            for (int j = 1; j <=i; j++) {
                fak *=j;
            }
            sum += fak;
        }
        System.out.println("the sum is " + sum);
        scan.close();
    }


    public void sum_sub_factorial(){
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int fak;
        int N;
        System.out.println("enter a last factorial");
        N = scan.nextInt();
        for (int i = 1; i <= N; i++) {
            fak = 1;
            for (int j = 1; j <=i; j++) {fak *=j;}
            if(i%2 == 1){sum +=fak;}
            else {sum-=fak;}
        }
        System.out.println("sum = "+ sum);
        scan.close();
    }


    public void factorial111(){
        Scanner scan = new Scanner(System.in);

        Double sum = 0.0;
        double fak;
        int N;
        System.out.println("enter a last factorial");
        N = scan.nextInt();

        for (int i =1 ; i <= N ; i++){
            fak =1; 
            for (int j = 1; j <=i; j++){
                fak *= j ;
            }
            sum = sum +(1/(i+ fak));
        }
        System.out.println("sum = "+ sum);
        scan.close();
    }
        public void factoria22222(){
        Scanner scan = new Scanner(System.in);

        Double sum = 0.0;
        double fak;
        int N;
        System.out.println("enter a last factorial");
        N = scan.nextInt();

        for (int i =1 ; i <= N ; i++){
            fak =1; 
            for (int j = 1; j <=i; j++){
                fak *= j ;
            }
            sum = sum +(i/(i+ fak));
        }
        System.out.println("sum = "+ sum);
        scan.close();
    }
}
