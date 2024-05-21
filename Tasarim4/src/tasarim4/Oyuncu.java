package tasarim4;

public class Oyuncu{
    
    private HamleStratejisi hamleStratejisi;

    public Oyuncu(HamleStratejisi hamleStratejisi)
    {
        this.hamleStratejisi = hamleStratejisi;
    }

    public void setHamleStratejisi(HamleStratejisi hamleStratejisi)
    {
        this.hamleStratejisi = hamleStratejisi;
    }
    
    public void hamleYap(){
        hamleStratejisi.hamleYap();
    }
}
