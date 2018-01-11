import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private ArrayList<String> allBooks;

    public void start() {
        System.out.println("Welcome");
        printBooks();
    }

    public Biblioteca() {
        allBooks = new ArrayList<String>();
    }

    public Biblioteca(ArrayList<String> allBooks) {
        this.allBooks = allBooks;
    }

    public void printBooks() {

        if (allBooks.isEmpty()){
            return;
        }

        StringBuffer books = new StringBuffer();

        for (String book: allBooks) {
            books.append(book + " ");
        }
        System.out.println(books.substring(0, books.length()-1));

    }
}
