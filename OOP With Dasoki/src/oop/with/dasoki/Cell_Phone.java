package oop.with.dasoki;

public class Cell_Phone {
    private String manufact;
    private String model;
    public static double retailPrice;
    public static int no_of_objects;

    public Cell_Phone(){
        manufact = "Phone";
        model = "i12";
        retailPrice = 1250.8;
        no_of_objects++;
    }

    public Cell_Phone(String man , String mod , double price){
        manufact = man;
        model = mod;
        retailPrice = price;
        no_of_objects++;
    }

    public void setManufact(String man){
        manufact = man;
    }

    public void setModel(String mod){
        model = mod;
    }

    public void setRetailPrice(double price){
        retailPrice = price;
    }

    public static int get_no_of_objects(){
        return no_of_objects;
        
    }
    public String getManufact(){
        return manufact;
    }

    public String getModel(){
        return model;
    }

    public double getRetailPrice(){
        return retailPrice;
    }
}
