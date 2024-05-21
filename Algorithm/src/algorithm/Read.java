package algorithm;
import java.util.Scanner;
public class Read {
    public void user_Information(){
        Scanner input = new Scanner(System.in);
        String name;
        String jop;
        int age;

        System.out.println("enter youe name");
        name = input.nextLine();

        System.out.println("enter youe jop");
        jop = input.nextLine();

        System.out.println("enter youe age");
        age =input.nextInt();
        
        System.out.println("your name is : " + name+ "\nyour jop is : "+ jop + "\nyour age is : "+ age);
        input.close();
    }

    public void sum(){
        Scanner input = new Scanner(System.in);
        int num ;
        int s = 0;
        
        System.out.println("enter your number in order find the sum");
        num = input.nextInt();
        for (int i = 0; i <= num; i++){
            s +=i; 
        }
        System.out.println("your final result is = "+ s);
        input.close();
    }
    
}
