
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Sirket {
         public List <Sefer> seferler = new ArrayList<>();
         public List <Ucak> ucaklar = new ArrayList<>();
         public String sirketadi ;
         public static List <Sirket> sirketler = new ArrayList<>();
         Sirket(String sirketadi){
             this.sirketadi = sirketadi ;
             sirketler.add(this);
                     Listat.sirketler.add(this);

         }
         
}
