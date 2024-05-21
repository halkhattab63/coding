package algorithm;
import java.util.Scanner;
public class Array {

    public void example1(){
        Scanner intput = new Scanner(System.in);
        int N  ;
        int[] vector1;

        do{
        System.out.println("enter a vector array length");
        N = intput.nextInt();
        }while( N< 0);
        System.out.println("-------------------------------------");

        vector1 = new int[N];
        System.out.println("vector length : " + vector1.length);

        System.out.println("-------------------------------------");
        for (int i = 0; i < N; i++){
            System.out.println("enter vector value [" + i + "] : ");
            vector1[i] = intput.nextInt();
        }
        System.out.println("-------------------------------------");
        for (int i = 0; i < vector1.length; i++){
            System.out.println("vector["+i+"] = "+ vector1[i] );
        }

        intput.close();
    }

    public void example2(){
        Scanner intput = new Scanner(System.in);
        int N ;
        int s = 0;
        int[] vector ;
        do{
        System.out.println("enter a vector array length");
        N = intput.nextInt();
        }while( N< 0);
        System.out.println("-------------------------------------");

        vector = new int[N];
        System.out.println("vector length : " + vector.length);

        System.out.println("-------------------------------------");
        for (int i = 0; i < N; i++){
            System.out.println("enter vector value [" + i + "] : ");
            vector[i] = intput.nextInt();
            s = s + vector[i];
        }
        System.out.println("-------------------------------------");
        System.out.println("sum is ="+ s);


        intput.close();
    }

    public void example3(){
        Scanner scan = new Scanner(System.in);
        int N =0;
        int P=0; 
        int Z=0 ;
        int L; 
        int[] vector;
        do{
            System.out.println("enter a vector array length");
            L = scan.nextInt();
        }while( L<0 );
        System.out.println("-------------------------------------");

        vector = new int[L];
        for(int i = 0; i < L;i++){
            System.out.println("enter vector value [" + i + "] : ");
            vector[i] = scan.nextInt();
        }
        System.out.println("-------------------------------------");

        for( int i = 0; i < vector.length ; i++){
            if (vector[i]>0 ) {P++;}
            else if (vector[i]< 0) {N++;}
            else{Z++;}
        }

        System.out.print("The number of positive numbers is: " +P+ "\n" );
        System.out.print("The number of negative numbers is: " +N+ "\n" );
        System.out.print("The number of zero numbers is: " +Z+ "\n" );

    scan.close();
    }
    public void example4(){
        Scanner scan = new Scanner(System.in);
        int temp;
        int[] vector = new int[5];
        for( int i = 0; i < vector.length; i++ ){
            System.out.print("Enter vector value ["+i+"] =");
            vector[i] = scan.nextInt();
        }
                System.out.println("-------------------------------------");
        for(int i = 0; i < vector.length; i++){
            System.out.println("vector["+i+"] ="+ vector[i]);
        }

        for(int i =0 ; i< vector.length; i++){
            for(int j= i+1;j < vector.length;j++){
                if (vector[i]>vector[j]) {
                    temp= vector[i];
                    vector[i]= vector[j];
                    vector[j] = temp;
                }
            }
        }
                System.out.println("-------------------------------------");
        for(int i =0 ; i< vector.length; i++){
            System.out.println("vector["+i+"]=" +vector[i]);
        }
        scan.close();
    }

    public void example5(){
        Scanner scan = new Scanner(System.in);
        int N;
        int[] vector;
        do{
            System.out.println("enter a vector array length");
            N = scan.nextInt();
        }while( N<0 );
        System.out.println("-------------------------------------");

        vector = new int[N];
        for( int i = 0; i < N; i++ ){
        System.out.print("Enter vector value ["+i+"] =");
        vector[i] = scan.nextInt();
        }
        for(int i = 0; i < vector.length; i++){
            System.out.println("vector["+i+"] ="+ vector[i]);
        }

        for(int i= 0; i<vector.length;i++){
            if (vector[i]>0) {
                vector[i] = 1;
            }
            else if(vector[i]<0){
                vector[i] = -1;
            }
        }
        System.out.println("-------------------------------------");

        for(int i=0; i<vector.length; i++){
            System.out.println("vector["+i+"] ="+ vector[i]);
        }
        scan.close();
    }
    public void example6(){
        Scanner scan = new Scanner(System.in);
        int[] A;
        int[] B;
        int[] C ;
        int L;
        
        do{
            System.out.print("enter a array length = ");
            L = scan.nextInt();
        }while(L<0);
        System.out.println("-------------------------------------");

        A = new int[L];
        B = new int[L];
        C = new int[L];
        for(int i=0; i<A.length; i++) {
            System.out.print("Enter A value ["+i+"] = ");
        A[i] = scan.nextInt();
        }
        System.out.println("-------------------------------------");
        for(int i=0; i<B.length; i++) {
            System.out.print("Enter B value ["+i+"] =");
            B[i] = scan.nextInt();
        }
        System.out.println("-------------------------------------");

        for(int i=0; i<A.length; i++) {
            C[i] = A[i] + B[i];
        }
        for(int i=0; i<C.length; i++) {
            System.out.println("C["+i+"] ="+ C[i]);
        }
        scan.close();


        /*
         * for (int i=0; i<=N-1; i++)
        {
            System.out.print("Enter A[" +i+ "]: ");
            A[i] = input.nextInt();

            System.out.print("Enter B[" +i+ "]: ");
            B[i] = input.nextInt();

            C[i] = A[i] + B[i];
        }
         */
    }
    public void example7(){
        Scanner scan = new Scanner(System.in);
        int[] A;
        int[] B;
        int[] C;
        int L;
        
        do{
            System.out.print("enter a array length = ");
            L = scan.nextInt();
        }while(L<0);
        System.out.println("-------------------------------------");

        A = new int[L];
        B = new int[L];

        for(int i=0; i<A.length; i++) {
            System.out.print("Enter A value ["+i+"] = ");
        A[i] = scan.nextInt();
        }
        System.out.println("-------------------------------------");
        for(int i=0; i<B.length; i++) {
            System.out.print("Enter B value ["+i+"] =");
            B[i] = scan.nextInt();
        }
        System.out.println("-------------------------------------");
        
        int k = 0;
        C = new int[L*2];
        for(int i=0; i < L; i++) {
            C[k] = A[i];
            C[k+1] = B[i];
            k +=2;
        }
        
        for(int i=0; i<L*2; i++) {
            System.out.println("C["+i+"] ="+ C[i]);
        }

    scan.close();
    }
}
