package lap_dersleri;

public abstract class Abstakt {
    private String marka;
    private int uretimYili;
    private int VitesSayi;

    public abstract String getMarka();

    public int getUretimYili() {
        return this.uretimYili;
    }
}
