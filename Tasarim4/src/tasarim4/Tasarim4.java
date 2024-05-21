package tasarim4;
import java.util.Scanner;
public class Tasarim4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HamleStratejisi stratejiOyuncu1 = kullaniciGirisindenStratejiSec();
        HamleStratejisi stratejiOyuncu2 = new SavunmaHamleStratejisi();

        Oyuncu oyuncu1 = new Oyuncu(stratejiOyuncu1);
        Oyuncu oyuncu2 = new Oyuncu(stratejiOyuncu2);

        OyunKontrolcusu oyunKontrolcusu = new OyunKontrolcusu(oyuncu1, oyuncu2);
        
        oyunKontrolcusu.hamleYap(oyuncu1);
        oyunKontrolcusu.hamleYap(oyuncu2);

        oyunKontrolcusu.oyunSonucunuDegerlendir();
        scanner.close();
    }
    private static HamleStratejisi  kullaniciGirisindenStratejiSec(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen birinci oyuncunun hamle stratejisini secin:");
        System.out.println("1. Rastgele Hamle Stratejisi");
        System.out.println("2. Savunma Hamle Stratejisi");
        int secim = scanner.nextInt();
        if (secim == 1) {return new RastgeleHamleStratejisi();}
        else { return new SavunmaHamleStratejisi();}
    }
    
}
