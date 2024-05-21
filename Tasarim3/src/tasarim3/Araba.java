package tasarim3;

public class Araba extends Arac {

    
    private int motorHacmi;
    public Araba(String marka, String model, int motorHacmi) {
    super(marka, model);
    this.motorHacmi = motorHacmi;
    }
    public int getMotorHacmi() {
    return motorHacmi;
    }

    public void setMotorHacmi(int motorHacmi) {
    this.motorHacmi = motorHacmi;
    }
    public void ozellikleriYazdir() {

    super.ozellikleriYazdir();
    System.out.println("Motor Hacmi :" + motorHacmi);
    }
}