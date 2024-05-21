package ntp_ders;
// import java.util.Scanner;
public class NTP_ders {

    // public  static void selamVer(){
    //     System.out.println("Merhaba");
    // }

    // public static int toplam(int num1 , int num2){
    //     int sonuc = num1 + num2;
    //     return sonuc;
    // }
    public static void main(String[] args) {
        System.out.println();
        System.out.println();

        if(args.length < 2){
            System.out.println("iki adet sayi gir");
            System.exit(-1);
        }
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double sonuc = ToplamaStc.toplam(a, b);
        System.out.println("sonuc = " + sonuc);

        // Statik s = new Statik();
        // Statik s1 = new Statik();
        // Statik.x =90;
        // s.y = 4;
        // s1.y = 5;
        // Statik.yaz(s); Statik.yaz(s1);

        // Tost_this t = new Tost_this();
        // t.sibarisGoster();

        // This guThis = new This();
        // guThis.gun_ekle(2);
        // guThis.gun_ekle(4);
        // guThis.goster();

        // This th = new This();
        // th.yumurtalar().yumurtalar().yumurtalar().goster();

        // Overloding o = new Overloding();
        // o.sum(3.6d, 8.5d);
        // o.sum(10,68 );
        // o.sum(15.1f, 3.5f,2.5f);

        // ArapaCons ar = new ArapaCons(2);
        // ArapaCons a = new ArapaCons(4,4);
        // ArapaCons Ar = new ArapaCons(6 ,8, 8);
        
        // Constructor constructor = new Constructor();
        // Constructor constructor1 = new Constructor(-1);
        // constructor.printing();

        // Switch switch1 = new Switch();
        // switch1.s();

        // Dongu dongu = new Dongu();
        // dongu.do_while();
        // dongu.f_or();
        // dongu.wh_ile();

        
        // kosulOp op = new kosulOp();
        // op.x();
        // Integer a1  = new Integer(35);
        // Integer a2 = new Integer(35);
        // System.out.println(a1 == a2);
        // System.out.println(a1 != a2); 


        // int a = 97 ;
        // double b = (double) a; 
        // char c = (char) b; 
        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(c);

        // char c = 'a';
        // int b = +c;
        // int x = -b;
        // System.out.println(c);
        // System.out.println(b);
        // System.out.println(x);
        // Harf harf = new Harf();
        // harf.c = 'a';
        // System.out.println("harf 1 -->"+ harf.c);
        // Pas.f(harf);
        // System.out.println("harf 2 -->"+ harf.c);

        // double a = 4.4;
        // Yordam.f(a);
        // System.out.println("a ---> "+a);

        // int a ;
        // a =5 ;
        // System.out.println(a);
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Birinci sayıyı girin: ");
        // int say1 = scanner.nextInt();
        // System.out.print("İkinci sayıyı girin: ");
        // int sayi2 = scanner.nextInt();
        // int toplam = say1 + sayi2;
        // System.out.println("Toplam: " + toplam);

        // for(int i = 0; i <10 ; i++){
        // System.out.println("sayi   " + i);
        // }

        // selamVer();
        // int toplam = toplam(13,14);
        // System.out.println("toplam = "+toplam);
    }
    
}
