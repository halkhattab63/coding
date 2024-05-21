/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Yolcu extends User{
    static int id = 100 ;
    
    Yolcu(Ucus ucus , int x , String ad){
        id++;
        ucus.yolcular.add(this);
        ucus.ucak.koltuk[x]--;
    }
    private final int myid = id+1;
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
