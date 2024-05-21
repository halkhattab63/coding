package lap_dersleri;
import java.util.Scanner;
public class Calculator {

    double sayi1;
    double sayi2;
    char islem;
    double sonuc;

    public static void  operatorler(){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("birinci sayi giriniz : ");
            double sayi1 = scanner.nextDouble();
            System.out.print("ikinci sayi giriniz : ");
            double sayi2 = scanner.nextDouble();
            System.out.print("bir operation giruiniz : ");
            char islem = scanner.next().charAt(0);
            double sonuc = 0.0;

            switch (islem) {
                case '+':
                    sonuc = sayi1 + sayi2;
                    break;
                case '-':
                    sonuc = sayi1 - sayi2;
                    break;
                case '*':
                    sonuc = sayi1 * sayi2;
                break;
                case '/':
                    if (sayi2 != 0) {sonuc = sayi1 / sayi2 ;}
                    else {System.out.println("sayi2 == 0  real sayilarda cozulmez ");return ;}
                    break;
                default:
                        System.out.println("operator yanlis");
                    break;
            }
            System.out.println(" sonucunuz = "+ sonuc);
        }
    }
}
