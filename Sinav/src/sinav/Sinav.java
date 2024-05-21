
package sinav;

import java.util.ArrayList;
import java.util.Scanner;


public class Sinav {

    public static void main(String[] args) {
        
        Car.b=6;
        System.out.println(Car.b);
        Scanner input =new Scanner(System.in);
        int a=input.nextInt();
        Car[] c = new Car[5];
        c[0]=new Car();
        c[1]=new Car();
        ArrayList<Car> cars=new ArrayList<>();
        cars.add(c[0]);
        cars.add(c[0]);
        cars.add(c[0]);
        
        for(Car car: cars){
            System.out.println(car.a);
        }
        
        
        
        
    }
    
}
