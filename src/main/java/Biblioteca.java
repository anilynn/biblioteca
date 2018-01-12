import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<String> allBooks;

    public void start() {
        System.out.println("Welcome!");
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
            books.append(book + ", ");
        }
        System.out.println(books.substring(0, books.length() - 2));

    }

    public static void main(String[] args) {
        ArrayList<String> bookList = new ArrayList<>();
        bookList.add("The Chamber of Secrets");
        bookList.add("The Goblet of Fire");
        bookList.add("The Prisoner of Azkaban");

        Biblioteca b = new Biblioteca(bookList);
        b.start();
    }
}

