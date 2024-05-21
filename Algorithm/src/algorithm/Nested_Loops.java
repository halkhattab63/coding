package algorithm;

public class Nested_Loops {
    public void stars(){
        for (int i = 0; i <3; i++) {
            for (int j = 0; j <5 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void columns_number(){
        for (int i = 0; i <3 ; i++){
            for(int j = 1; j <=5; j++) {
                System.err.print(j+" ");
            }
            System.out.println();
        }
    }
    public void rows_number(){
        for (int i = 0; i <5 ; i++){
            for(int j = 1; j <=i+1; j++) {
                System.out.print(j + " ");    
            }
            System.out.println();
        }
    }
    public void Ters_rows_numbers(){
        /*
         * ALgorithm : Ters_rows_numbers
         *  Begin 
         *      for(int i= 1 --------> 5)
         *      Begin 
         *          for(int j= 1 --------> 5-i+1)
         *          Begin
         *              print(j + " ");
         *           end
         *          print("\n");
         *       end
         *   end
         * 
         */
        for(int i = 5; i>0 ; i--){
            for(int j = 1; j <=i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public void Symbols(){
        for(int i = 0; i <=5 ; i++){
            for(int k = 1; k <=5-i ; k++){
                System.out.print("- ");
            }
            for(int j = 0; j <=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void symbols1(){

        System.out.print("* \n");

        for(int i = 2; i < 7 ; i++){
            System.out.print("* ");
            for(int k = 1 ; k <= i - 2 ; k++){
                System.out.print("- ");
            }
            System.out.print("* \n");
        }

        for(int j = 1; j < 8; j++){
            System.out.print("* ");
        }
    }
}