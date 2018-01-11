import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BibliotecaTest {


    public void printSetup(OutputStream os) {
        // Arrange our objects
        PrintStream ps = new PrintStream(os);
        System.setOut(ps);
    }

    @Test
    public void shouldPrintWelcomeWhenNoBooks() {
        OutputStream os = new ByteArrayOutputStream();
        printSetup(os);
        Biblioteca biblioteca = new Biblioteca();

        // Action we are testing
        biblioteca.start();

        String expected = "Welcome\n";

        // Assert that the action caused the expected result
        assertEquals(expected,os.toString());

        }

     @Test
    public void shouldPrintWelcomeAndOneBook() {
         OutputStream os = new ByteArrayOutputStream();
         printSetup(os);
         ArrayList<String> allBooks = new ArrayList<>();

         allBooks.add("The Hobbit");

         Biblioteca biblioteca = new Biblioteca(allBooks);

         // Action we are testing
         biblioteca.start();

         String expected = "Welcome\nThe Hobbit\n";

         // Assert that the action caused the expected result
         assertEquals(expected,os.toString());
     }



    }


