package ntp_ders;

public class Constructor {
    public Constructor(){
        System.out.println("hello constructor");
        return ;
    
    }
    public Constructor(int addet ){
        System.out.println(addet + " : constructor ");
    }

    public void printing(){
        for (int i = 0; i <5 ; i++) {
            new Constructor(); 
            new Constructor(i);
        }
    }
}
