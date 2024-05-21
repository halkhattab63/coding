
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
   class Personel extends User{
    public List<Ucus> ucuslar;
    static int id = 0 ;
    private final int myid = id+1;
    Personel(){
        
        ucuslar=new ArrayList<>();
        Listat.personeller.add(this);
        id++;
    }

    @Override
    int getid() {
    return myid;
    }

    @Override
    void setad(String ad) {
        this.ad=ad;
    }
    @Override
    String getad(){
        return ad;
    }


}
