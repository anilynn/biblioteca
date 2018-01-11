import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private ArrayList<String> allBooks;

    public void start() {
        System.out.println("Welcome");
        printBooks();
    }

    public ArrayList<String> getBooks() {
        return allBooks;
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

        String books = "";

        for (String book: allBooks) {
            books += book + " ";
        }

        System.out.println(books.substring(0, books.length()-1));

    }
}
