                                                             
package javaapplication1;  

public class JavaApplication1 {
     
        static void welcomeMessage(){
        System.out.println("hello welcome in java language");
    }
    
        public static int sum(int a,int b){
//            int x = a ; `
//            int y = b; 
//            int sum1 = x+y;
//            System.out.println(x+" + "+y +" = "+sum1);
            return a+b;
        }


    public static void main(String[] args) {
//       byte x = 45;
//       float y = 6.6f;
//       System.out.printf("x = %d ve y = %f\n",x,y);
//       System.out.println(x);
//       System.out.println("hello world");
//       System.out.println(10);
//        welcomeMessage();
          
//        sum(14,40);
//        sum(25,6);
//        System.out.println(sum(25,6));
        Kitap kitap = new Kitap();
        kitap.math();
    }

    
}
