/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasarim3;

/**
 *
 * @author HAYYAN ALKHATTAB
 */
public class Tasarim3 {

    public static void main(String[] args) {

        Araba araba1 = new Araba("Toyota", "Supra MK3", 2491 );
        Motosiklet moto1 = new Motosiklet("Yamaha", "R-Series", "Manuel");

        araba1.ozellikleriYazdir();
        System.out.println("-----");
        moto1.ozellikleriYazdir();
        }
}