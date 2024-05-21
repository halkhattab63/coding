package design.pattern;

import design.pattern.Adapter.Computer;
import design.pattern.Adapter.Divice;
import design.pattern.Adapter.Phone;
import design.pattern.Adapter.PhoneAdabter;
import design.pattern.Adapter.Vehich;


public class DesignPattern {

    public static void main(String[] args) {
        /***********************************Factory************************************************* */
        // Sandwich sandwich = Sandwich_factory.createSandwich(Sandwich_factory.CHEESE_BURGER);
        // sandwich.printINFO();

        // Sandwich sandwich2 = Sandwich_factory.createSandwich(Sandwich_factory.CHICKEN_BURGER);
        // sandwich2.printINFO();
    
        /**************************************Singelthon***************************************************** */
        // Singel singel = Singel.get_instance();
        // singel.printer();

        // Singel singel2 = Singel.get_instance();
        // singel2.printer();

        /******************************************Observer********************************************************* */

        // Publisher pub  = new Publisher();
        // new Reader(pub);
        // new Frind(pub);
        // pub.setUpdate("art1");
        // pub.setUpdate("art2");
        // pub.setUpdate("art3");
        /**************************************Adabter****************************************************************** */
        
        Divice co = new Computer();
        Divice phA = new PhoneAdabter(new Phone());
        System.out.println("*-----------------------*");
        Vehich.vehich(phA);
        System.out.println("*-----------------------*");
        Vehich.vehich(co);
    }
    
}
