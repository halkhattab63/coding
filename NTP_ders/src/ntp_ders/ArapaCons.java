package ntp_ders;

public class ArapaCons {
    int Kapi_sayisi ;
    int vites_sayisi ;
    int koltuk_sayisi ;
    
    public ArapaCons(int adet){
        koltuk_sayisi = adet; 
    }

    public ArapaCons(int adet , int sayi ) { 
        koltuk_sayisi = adet; 
        vites_sayisi = sayi; 
    }
    
    public ArapaCons(int adet , int sayi , int num ) {
        koltuk_sayisi = adet;  
        vites_sayisi = sayi ;
        koltuk_sayisi = num; 
    }
}
