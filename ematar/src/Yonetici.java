/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Yonetici extends User{
    

    Yonetici(){

    }
    private final int myid = 1;
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
