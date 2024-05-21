package ntp_ders;

public class Dongu {
    public void wh_ile(){

        int i = 0;
        while (i<10) {
            System.out.println("i = " + i++);
        }
        System.out.println("Sayma islemi tamamlandi.");
    }

    public void f_or(){

    for (int j=0; j<10; j++) {
        System.out.println("j = " + j);
    }
    System.out.println("Sayma islemi tamamlandi.");
    }

    public void do_while(){
        int x = 0;
        do{
            System.out.println("x = " + x++);
        }while(x < 10);
        System.out.println("Sayma islemi tamamlandi.");

    }
}
