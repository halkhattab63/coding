package emre_uml;

import java.util.ArrayList;

public class LibraryManagementSystem {
    private ArrayList<User> users = new ArrayList<>();
    private ArrayList<Book> books = new ArrayList<>();
    private Libarian libarian ;

    public LibraryManagementSystem(ArrayList<User> users ,ArrayList<Book> books, Libarian libarian) {
        this.users.addAll(users);
        this.books.addAll(books);
        this.libarian =  new Libarian();
    }
}
