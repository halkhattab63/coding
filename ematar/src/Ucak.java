
import java.util.ArrayList;
import java.util.List;

class Ucak {
    
    private final int toplamkoltuk ;
    public final int[] koltuk;
    private final int personelsayisi ;
    private final String ucakadi ;
    public String UcakTipi ;
    public String adi ;
    Ucak(int standartk , int businessk , int ekonomikk , int personelsayisi , String ucakadi , Sirket sirket){
        this.koltuk = new int[3];
        this.toplamkoltuk = koltuk[0] + koltuk[1] + koltuk[2];
        this.koltuk[0] = standartk ;
        this.koltuk[1] = businessk ;
        this.koltuk[2] = ekonomikk ;
        this.adi=ucakadi;
        this.personelsayisi = personelsayisi ;
        this.ucakadi = ucakadi ;
        if (toplamkoltuk > 250)
            this.UcakTipi = "buyuk" ;
        else if(toplamkoltuk < 200)
            this.UcakTipi = "kucuk" ;
        else this.UcakTipi = "orta" ;
        sirket.ucaklar.add(this);
                Listat.ucaklar.add(this);

        
    }
    
}
