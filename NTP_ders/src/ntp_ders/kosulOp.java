package ntp_ders;

public class kosulOp {
    int a = 1 ; 
    int b = 2 ;
    int c = 3 ;
    int d = 4 ;
    public void x(){
        System.out.println("&&--> "+ ((a<b)&&(c<b)));
        System.out.println("||--> " + ((a<b)||(c<b)));
        System.out.println("!--> " + (!(a<b)));
        System.out.println("^--> " + ((a<b)^(c<b)));
        System.out.println("&--> " + ((a<b)&(c<b)));
        System.out.println("|--> " + ((a<b)|(c<b)));
    }

    
}
