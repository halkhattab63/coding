package algorithm;
import java.util.Scanner;

public class Function {

    Scanner scanner = new Scanner(System.in);
    public void sum(double x, double y) {
        System.out.println("the first  number is " + x);
        System.out.println("the second number"+ y);
        System.out.println("sum =  " + (x + y));
    }

    public  int maximum(int a, int b) {
        if (a > b) {
            return a;
        }
        else if (a < b) {
            return b;         
        }
        else {
            return 0;
        }
    }



    public void average(){
        String[] methods = new String[5];
        methods[0] = "Math";
        methods[1] = "Algorithm";
        methods[2] = "network";
        methods[3] = "java";
        methods[4] = "Android";
        int[] note = new int[5];
        double avg = 0;
        
        for(int i = 0; i <5; i++) {
            System.out.print("Enter the "+methods[i]+" note : ");
            note[i] = scanner.nextInt();
        }
        for(int i = 0; i < 5; i++) {
            avg += note[i];
        }
        avg = avg /note.length;
        System.out.println("-------------------------------------------------------");
        if (avg <= 20 && avg >= 10 ) {
            System.out.println("the student successfully : " + avg );
        }
        else if (avg <= 9 && avg >= 0 ){
            System.out.println("the student failed : " + avg );
        }
        else {
            System.out.println("the information yor entered is incorrect");
        }
    }



    public void average_update(double[] a ){
        double sum =0 ;
        for(int i = 0; i <a.length; i++) {
            sum += a[i];
        }
        sum = sum / a.length;
        if (sum <= 20 && sum >= 10 ) {
            System.out.println("the student successfully : " + sum );
        }
        else if (sum <= 9 && sum >= 0 ) {
            System.out.println("the student failed : " + sum );
        }
        else {
            System.out.println("the information yor entered is incorrect");
        } 
    }



    public void findFirst(int[] a, int b){
        boolean StopSearch = false;
        int i = 0;
        while (StopSearch == false && i < a.length) {
            if (a[i] == b) {
                System.out.println(b + " is exist at index number  : "+ i);
                StopSearch = true;
            }
            i++;
        }
        if (StopSearch == false) {
            System.out.println(b + " is not exist");
        }
    }


    
    public void findAll(int[] a, int b){
        int i = 0;
        int j = 0;
        for (i = 0; i < a.length; i++) {
            if (a[i] == b) {
                System.out.println(b + " is exist at index number  : "+ i);
                j++;
            }
        }
        if (j == 0) {
            System.out.println(b + " is not exist");
        }
    }

}
