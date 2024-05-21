package emre_uml;

import java.util.ArrayList;

public class User extends Book{

    private Account account;
    private ArrayList<Book> books = new ArrayList<>();
    
    public User(Account account) {
        this.account = account;
    }
    
}
