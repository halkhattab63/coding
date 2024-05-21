package tasarim_odev_2;

public class Urun {

    public String adi;
    public String kodu;
    public String kategori;
    public double fiyat;
    public int stokAdeti;
    
    public Urun(String adi, String kodu) {
        this.adi = adi;
        this.kodu = kodu;
        this.kategori = "Kategory";
        this.fiyat = 25000;
        this.stokAdeti = 12;
    }

    public Urun(String adi, String kodu, double fiyat, int stokAdeti) {
        this.adi = adi;
        this.kodu = kodu;
        this.kategori = "Kategory";
        this.fiyat = fiyat;
        this.stokAdeti = stokAdeti;
    }

    public Urun(String adi, String kodu, String kategori, double fiyat, int stokAdeti) {
        this.adi = adi;
        this.kodu = kodu;
        this.kategori = kategori;
        this.fiyat = fiyat;
        this.stokAdeti = stokAdeti;
    }
    
    public void yazdir(){
        
        System.out.println("urun adi: "+this.adi);
        System.out.println("urun Kodu: "+this.kodu);
        System.out.println("urun Fiyat: "+this.fiyat);
        System.out.println("Kategory: "+this.kategori);
        System.out.println("Stok Adeti: "+this.stokAdeti);
        System.out.println("--------------------------------");
    }

}
