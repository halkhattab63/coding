package ntp_ders;
class Sayi{
    int i ;
}

public class nesneVeAtama {
    public static void main(String[] args){
        Sayi sayi1 = new Sayi();
        sayi1.i = 5;

        Sayi sayi2 = new Sayi();
        sayi2.i = 10; 

        System.out.println("1: s1.i: " + sayi1.i +", s2.i: " + sayi2.i);
        sayi1 = sayi2 ; // referanslar kopyalaniyor .. nesneler degil
        System.out.println("2: s1.i: " + sayi1.i +", s2.i: " + sayi2.i); 
        sayi1.i = 30 ;
        System.out.println("3: s1.i: " + sayi1.i +", s2.i: " + sayi2.i);

    }
}
