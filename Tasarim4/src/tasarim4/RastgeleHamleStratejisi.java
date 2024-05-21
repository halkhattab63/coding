package tasarim4;

import java.util.Random;

public class RastgeleHamleStratejisi implements HamleStratejisi {

    @Override
    public void hamleYap() {
        Random random = new Random();
        char[] hamleler = { 'X','O'}; 
        char rastgel_hamle = hamleler[random.nextInt(hamleler.length)];
        System.out.println("Rastgele Hamle Stratejisi = "+ rastgel_hamle);
    }
    
}
