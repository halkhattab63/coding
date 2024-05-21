package odevtasarim;

public class ucgeninTipi {

    public void tip(){

        int a = 5; 
        int b = 3; 
        int c = 4; 
        
        if(a == b || b == c || a ==c  ){ System.out.println("İkizkenar üçgen");}

        else if (a==c && c == b) {System.out.println("Eşkenar üçgen");}

        else if ((a*a + b*b) == c*c|| (a*a + c*c) == b*b |( c*c + b*b) == a*a) {System.out.println("dik üçgen");}

        else { System.out.println("Çeşitkenar üçgen");}
    }
}
