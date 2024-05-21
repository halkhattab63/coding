/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Personel pilot = new Pilot("Hasan") ;
        Hostes host=new Hostes("Hasna");    
        Yonetici y2 = new Yonetici() ;
        y2.setad("hasan");
        Sirket sirket=new Sirket("AirPort");
        Ucak ucak=new Ucak(16,10,12,2,"AndoluJet",sirket);

        int i=10001;
        for(String hava:Listat.HavaLimanlar){
            i++;
            Sefer sefer=new Sefer(Listat.HavaLimanlar[0],hava,i,i-1111,sirket,i-1000);
            new Ucus(sefer,ucak, (Pilot) pilot,host,"04:30","2023/12/12");
        }
            
        
        AnaSayfa anasayfa = new AnaSayfa();
        anasayfa.setVisible(true);

    }
    
}
