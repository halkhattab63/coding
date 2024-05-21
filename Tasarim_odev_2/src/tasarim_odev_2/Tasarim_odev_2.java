package tasarim_odev_2;

public class Tasarim_odev_2 {

    public static void main(String[] args) {

        Urun u1=new Urun("Samsung Galaxy S23", "213r43", "phone", 20000 , 50 );
        Urun u2=new Urun("Samsung Galaxy S23 plus ", "213m43");
        Urun u3=new Urun("Samsung Galaxy S20 plus ", "210r43", 15000, 60);
        Urun u4=new Urun("Samsung Galaxy Note 10 ", "120n45", "phone", 23000, 50);
        
        u1.yazdir();
        u2.yazdir();
        u3.yazdir();
        u4.yazdir();
    }
    
}
