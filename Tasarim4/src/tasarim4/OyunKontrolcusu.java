package tasarim4;

public class OyunKontrolcusu {
    private Oyuncu oyuncu1;
    private Oyuncu oyuncu2;

    public OyunKontrolcusu(Oyuncu oyuncu1 , Oyuncu oyuncu2) {
        this.oyuncu1 = oyuncu1;
        this.oyuncu2 = oyuncu2;
    }
    public void hamleYap (Oyuncu oyuncu){
        oyuncu.hamleYap();
    }
    public void oyunSonucunuDegerlendir(){
        System.out.println("Oyun sona erdi. Kazanan belirleniyor...");
    }
}
