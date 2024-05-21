package algorithm;

public class RecursiveFunction {
    public int countFromTo(int start , int end){
        if (start<= end) {
            System.out.println("counter  = "+ start);
            return countFromTo(start+1, end);            
        }
        return 0;
    }



    public int countRecursively(int start ){
        if (start >=1) {
            System.out.println("counter  = "+ start);
            return countRecursively(start-1); 
        }
        return 0;
    }



    public int factorial(int a){
        if (a>0) {
            return a*factorial(a-1);
        }
        return 1 ;
    }
}
