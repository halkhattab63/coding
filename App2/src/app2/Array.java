package app2;

public class Array {
    // public void array(){
    //     int[] numbers = new int[5];

    //     for(int i = 0; i <numbers.length; i++){
    //         System.out.println("number ["+ i + "] :  " + numbers[i] );
    //     }
    //     numbers[0] = 100;
    //     numbers[1] = 200;
    //     numbers[2] = 300;
    //     numbers[3] = 400;
    //     numbers[4] = 500;

    //     for(int j = 0; j < numbers.length; j++){
    //         System.out.println("number ["+ j + "] :  " + numbers[j] );
    //     }
    //     for(int element : numbers){
    //         System.out.println(element);
    //     }
    // }

    public  int[] reverseArray (int[] array1){
        int[] result = new int[array1.length];

        for(int i = 0, j= result.length-1 ; i< array1.length ; i++,j--){
            result[j] = array1[i];
        }
        return result;

}

}