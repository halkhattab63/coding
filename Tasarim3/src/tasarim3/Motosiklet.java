package tasarim3;

public class Motosiklet extends Arac{
    private String vitesTuru;

    public Motosiklet(String marka, String model, String vitesTuru) {

    super(marka, model);
    this.vitesTuru = vitesTuru;
    }

    public String getVitesTuru() {
    return vitesTuru;
    }

    public void setVitesTuru(String vitesTuru) {
    this.vitesTuru = vitesTuru;
    }

    public void ozellikleriYazdir() {

    super.ozellikleriYazdir();
    System.out.println("Vites Türü :" + vitesTuru);
    }
}