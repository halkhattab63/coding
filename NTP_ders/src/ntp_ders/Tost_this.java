package ntp_ders;

public class Tost_this {
    int sayi;
    String melzeme ; 
    public Tost_this(){
        this(5);
        // this(1,"sucuk"); sadece bir this 
        System.out.println("parametresiz Tost_this");
    }
    public Tost_this(int sayi) {
        this(4,"sucuk");
        this.sayi = sayi;
        System.out.println("parametre sayi Tost_this");
    }
    public Tost_this(int sayi, String melzeme) {
        this.melzeme = melzeme;
        this.sayi = sayi;
        System.out.println("parametre sayi && melzeme Tost_this");
    }
    
    public void sibarisGoster(){
        // this(1,"s"); sadece  constructerde gullanir 
        System.out.println("sayi : "+ sayi + "  melzeme : "+ melzeme);
    }
}
