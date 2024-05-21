package ntp_ders;

public class Overloding {
    public void sum(int a , int b){
        int sonuc = a + b;
        System.out.println("sum int ==> "+ sonuc);
    }
    public void sum(double a , double b){ 
        double sonuc = a + b;
        System.out.println("sum double ==> "+sonuc);
    }

    public void sum(float a , float b, float c){
        float sonuc = (a + b)*c;
        System.out.println("sum float ==> "+ sonuc);
    }
}