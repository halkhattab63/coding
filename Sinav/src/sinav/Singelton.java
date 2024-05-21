package sinav;

public class Singelton {
    private static Singelton instance ;
    private Singelton (){}
    public static Singelton getInstonce(){
        if(instance == null){instance = new Singelton();}
        return instance;
        }

        public void showMessage(){
            System.out.println("hello");
        }
}
