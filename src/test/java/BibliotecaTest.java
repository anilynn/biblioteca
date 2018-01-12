import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BibliotecaTest {
    public OutputStream os;

    @Before
    public void printSetup() {
        // Arrange our objects
        os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        System.setOut(ps);
    }

    @Test
    public void shouldPrintWelcomeWhenNoBooks() {
        Biblioteca biblioteca = new Biblioteca();

        // Action we are testing
        biblioteca.start();

        String expected = "Welcome!\n";

        // Assert that the action caused the expected result
        assertEquals(expected,os.toString());

        }

     @Test
    public void shouldPrintWelcomeAndOneBook() {
         ArrayList<Book> allBooks = new ArrayList<>();

         allBooks.add(new Book("The Hobbit", "J.R.R. Tolkien", "1937"));

         Biblioteca biblioteca = new Biblioteca(allBooks);

         // Action we are testing
         biblioteca.start();

         String expected = "Welcome!\nThe Hobbit | J.R.R. Tolkien | 1937\n";

         // Assert that the action caused the expected result
         assertEquals(expected,os.toString());
     }

     @Test
    public void shouldPrintListOfBooks() {
         ArrayList<Book> allBooks = new ArrayList<>();

         allBooks.add(new Book("The Hobbit", "J.R.R. Tolkien", "1937"));
         allBooks.add(new Book("The Two Towers", "J.R.R. Tolkien", "1947"));

         Biblioteca biblioteca = new Biblioteca(allBooks);

         biblioteca.start();
         String expected = "Welcome!\nThe Hobbit | J.R.R. Tolkien | 1937\nThe Two Towers | J.R.R. Tolkien | 1947\n";

         assertEquals(expected, os.toString());
     }

     @Test
    public void shouldPrintBookTitleAuthorAndYearPublished() {
        Book b = new Book("The Hobbit", "J.R.R. Tolkien", "1937");
        String expected = "The Hobbit | J.R.R. Tolkien | 1937\n";

        b.printDetails();
        assertEquals(expected, os.toString());
     }

    }


