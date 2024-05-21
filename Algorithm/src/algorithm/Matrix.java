package algorithm;
import java.util.Scanner;

public class Matrix {
    public void example1() {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix ;
        int c  ;
        int r ;
        do{
            System.out.print("enter a matrix column: ");
            c = scanner.nextInt();
            System.out.print("enter a matrix row: ");
            r = scanner.nextInt();
        }while(c < 0 && r <0);
        System.out.println("-------------------------------------------------------");
        matrix = new int[c][r];
        for(int i = 0; i <c; i++) {
            for(int j = 0; j <r; j++) {
                System.out.print("enter matrex value [" + i + "]["+j+"] : ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("-------------------------------------------------------");
        for(int i = 0; i <c; i++) {
            for(int j = 0; j <r; j++) {
                System.out.print(matrix[i][j] +"\t");
            }
            System.out.println();
        }

        scanner.close();
    }
    public void example2(){
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        int S =0 ; 
        for(int i = 0; i <3; i++) {
            for(int j = 0; j <3; j++) {
                System.out.print("enter matrex value [" + i + "]["+j+"] : ");
                matrix[i][j] = scanner.nextInt();
                S = S + matrix[i][j];
            }
        }
        System.out.println("-------------------------------------------------------");
        System.out.println("the sum = "+ S);

        scanner.close();

    }
    public void example3(){
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        int S = 0 ;
        for(int i =0; i <3 ; i++){
            for(int j = 0 ; j<3 ; j++){
                System.out.print("enter matrex value [" + i + "]["+j+"] : ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("-------------------------------------------------------");
        for(int i =0; i <3 ; i++){
            for(int j = 0 ; j<3 ; j++){
                S = S + matrix[i][j];
            }
            System.out.println("the sum of row["+i+"]= "+ S );
            S =0;
        }
        scanner.close();
    }
    public void example4(){
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        int S = 0 ;
        for(int i =0; i <3 ; i++){
            for(int j = 0 ; j<3 ; j++){
                System.out.print("enter matrex value [" + i + "]["+j+"] : ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("-------------------------------------------------------");
        for(int i =0; i <3 ; i++){
        
            for(int j = 0 ; j<3 ; j++){
                S = S + matrix[j][i];
            }
            System.out.println("the sum of row["+i+"]= "+ S );
            S =0;
        }
        scanner.close();
    }
    public void example6(){
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[3][4];
        int[] vector = new int[3*4];
        int k = 0;
        for(int i =0; i <3 ; i++){
            for(int j = 0 ; j<4 ; j++){
                System.out.print("enter matrex value [" + i + "]["+j+"] : ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("-------------------------------------------------------");
            for(int i =0; i <3 ; i++){
            for(int j = 0 ; j<4 ; j++){
                vector[k] = matrix[i][j];
                k+=1;
            }
        }
        System.out.print("vector = ");
        for(int i =0; i <vector.length ; i++){
            System.out.print(vector[i]+"\t");
        }
        scanner.close();
    }
    public void example7(){
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[4][4];
        int S_up = 0;
        int S_in = 0;
        int S = 0;
        for(int i =0; i <4 ; i++){
            for(int j = 0 ; j<4 ; j++){
                System.out.print("enter matrex value [" + i + "]["+j+"] : ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("-------------------------------------------------------");
        for(int i = 0; i <4; i++) {
            for(int j = 0; j <4; j++) {
                System.out.print(matrix[i][j] +"\t");
            }
            System.out.println();
        }
        for(int i =0; i <4 ; i++){
            for(int j = 0 ; j<4 ; j++){
                if (i == j) {S += matrix[i][j];}
                else if (i < j ){S_in +=matrix[i][j];}
                else {S_up += matrix[i][j];}
            }
        }
        System.out.print("The sum of elements above the diagonal is: " +S_in+ "\n");
        System.out.print("The sum of elements on the diagonal is: " +S+ "\n");
        System.out.print("The sum of elements under the diagonal is: " +S_up+ "\n");
scanner.close();
    }
    public void example8(){
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[3][5];
        int x ;
        int num = 0;
        for(int i =0 ; i<3 ; i++){
            for(int j =0 ; j< 5; j++){
                System.out.print("enter matrex value [" + i + "]["+j+"] : ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("-------------------------------------------------------");
        for(int i = 0; i <3; i++) {
            for(int j = 0; j <5; j++) {
                System.out.print(matrix[i][j] +"\t");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------------------");
        System.out.print("enter any number : ");
        x = scanner.nextInt();
        for(int i = 0; i <3; i++) {
            for(int j = 0; j <5; j++) {
                if (matrix[i][j] == x) {
                    num++;
                }
            }
        }
        System.out.println("-------------------------------------------------------");

        System.out.print(x + " is exist " +num+ " times in the Matrix \n");
        scanner.close();
    }
    public void example9(){
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[3][5];
        int x ;
        boolean num = false;
        int i ;
        int j ; 
        for(i =0 ; i<3 ; i++){
            for( j =0 ; j< 5; j++){
                System.out.print("enter matrex value [" + i + "]["+j+"] : ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("-------------------------------------------------------");
        for( i = 0; i <3; i++) {
            for( j = 0; j <5; j++) {
                System.out.print(matrix[i][j] +"\t");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------------------");
        System.out.print("enter any number : ");
        x = scanner.nextInt();
        i = 0; 
        while (i< 3 && num == false) {
            j = 0;
            while (j < 5 && num == false) {
                if (matrix[i][j] == x ){ num = true; }
                j++;
            }
            i++;
        }
        System.out.println("-------------------------------------------------------");
        if(num == true ){System.out.print(x + " is exist in the matrix \n");}
        else{System.out.print(x + " is not exist in the matrix \n");}
scanner.close();
    }

    public void example10(){
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        int[] vector = new int[3];
        int i ; 
        int j ;
        int S = 0; 
        for(i =0 ; i<3 ; i++){
            for( j =0 ; j< 3; j++){
                System.out.print("enter matrex value [" + i + "]["+j+"] : ");
                matrix[i][j] = scanner.nextInt();
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------------------");
        for( i = 0; i <3; i++) {
            for( j = 0; j <3; j++) {
                System.out.print(matrix[i][j] +"\t");
            }
            System.out.println();
        }

        for( i =0; i <3 ; i++){
            for( j = 0 ; j<3 ; j++){
                S = S + matrix[i][j];
            }
            vector[i] = S ; 
            S =0;
        }
        System.out.println("-------------------------------------------------------");
        i =0 ; 
        System.out.print("\nvector contain these values:\n");
        while( i < vector.length){
            System.out.print(vector[i] + "\t");
            i++;
        }
scanner.close();
    }
}
