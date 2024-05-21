package ntp_ders;

public class This {
    // int yurta_sayisi;

    // This yumurtalar(){
    //     yurta_sayisi++;
    //     return this;    
    // }
    // public void goster(){
    //     System.out.println("yumurta sayisi " + yurta_sayisi);
    // }


    int gun , yil ,ay;
    
    public void gun_ekle(int gun){
        this.gun += gun;
    } 

    public void goster(){
        System.out.println("gun == " + gun);
    }

}
