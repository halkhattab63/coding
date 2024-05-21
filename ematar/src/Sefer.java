/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
class Sefer {
    public String nereden;
    public String nereye;
    public int km;
    public static int id = 501;
    public int sure;
    public int seferid;
    public int fiyat;
    public Sirket sirket;
    
    Sefer(String nereden , String nereye , int km , int sure , Sirket sirket , int fiyat){
        this.nereden = nereden ;
        this.nereye = nereye ;
        this.km = km ;
        this.sure = sure ;
        this.sirket=sirket;
        sirket.seferler.add(this);
        this.fiyat = fiyat ;
        seferid = id ;
        id++ ;
                Listat.seferler.add(this);

    }
}
