package tasarim3;

public class Arac {
        
    private String marka;
    private String model;

    public Arac(String marka, String model) {
    this.marka = marka;
    this.model = model;
    }
    public String getMarka() {
    return marka;
    }

    public void setMarka(String marka) {
    this.marka = marka;
    }

    public String getModel() {
    return model;
    }

    public void setModel(String model) {
    this.model = model;
    }


    public void ozellikleriYazdir() {
    System.out.println("Marka :" + marka);
    System.out.println("Model :"+model);
    }
}