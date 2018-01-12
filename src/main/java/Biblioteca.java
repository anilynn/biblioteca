import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Book> allBooks;

    public void start() {
        System.out.println("Welcome!");
        printBooks();
    }

    public Biblioteca() {
        allBooks = new ArrayList<>();
    }

    public Biblioteca(ArrayList<Book> allBooks) {
        this.allBooks = allBooks;
    }

    public void printBooks() {

        if (allBooks.isEmpty()){
            return;
        }

        StringBuffer books = new StringBuffer();

        for (Book book: allBooks) {
            books.append(book.toString() + "\n");
        }
        System.out.println(books.substring(0, books.length() - 1));

    }

    public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(new Book("The Chamber of Secrets", "JK Rowling", "1997"));
        bookList.add(new Book("The Goblet of Fire", "JK Rowling", "2000"));
        bookList.add(new Book("The Prisoner of Azkaban", "JK Rowling", "1999"));

        Biblioteca b = new Biblioteca(bookList);
        b.start();
    }
}

