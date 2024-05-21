
import java.util.ArrayList;
import java.util.List;

class Ucus extends Sefer{

    public Ucak ucak;
    public final List<Yolcu> yolcular = new ArrayList<>();
    public final List<Pilot> pilotlar = new ArrayList<>();
    public final List<Hostes> hostesler = new ArrayList<>();
    String kalkissaati;
    String tarih;

    Ucus(Sefer sefer, Ucak ucak, Pilot pilot, Hostes hostes, String kalkissaati, String tarih) {
        super(sefer.nereden,sefer.nereye,sefer.km,sefer.sure,sefer.sirket,sefer.fiyat);
        this.ucak = ucak;
        pilotlar.add(pilot);
        hostesler.add(hostes);
        pilot.ucuslar.add(this);
        hostes.ucuslar.add(this);
        Listat.ucuslar.add(this);
        this.kalkissaati = kalkissaati;
        this.tarih = tarih;
        Listat.ucuslar.add(this);
        
    }
}
