package algorithm;

public class Sum_Odd_Numbers {
    public void sum_not_model(){
        int s = 0 ;
        for(int i= 1; i <= 10 ; i+=2 ){
            s+=i ;
        }
        System.out.println("sum == " + s);
    }
    public void sum_odd_model(){
        int s = 0 ;
        for(int i= 0; i <= 10 ; i++ ){
            if (i%2 ==1) {
                s+=i ;
            }
        }
        System.out.println("sum ==" + s);
    }

    public void sum_even_model(){
        int s = 0 ;
        for(int i= 1; i <= 10 ; i++){
            if (i%2 ==1) {
                System.out.println("s = "+s+ " + " +i +" = "+(s+i));             
                s+=i ;   
            }
            else if (i%2 ==0) {
                System.out.println("s = "+s+" - "+i+" = "+ (s-i));
                s-=i;
            }
        }       
    }
    public void division(){
        double s = 0;
        for(double i = 1; i<=100 ; i++){
            if (i%2 == 1) {
                s = s+ (1/i);
            }
            else if (i%2 == 0) {
                s = s - (1/i);
            }
        }
        System.out.println("S = "+ s);
    }
    
}
