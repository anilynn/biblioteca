import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class BibliotecaTest {

    @Test
    public void shouldReturnWelcomeWhenBibliotecaStarts() {
        // Arrange our objects
        OutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        System.setOut(ps);


        Biblioteca biblioteca = new Biblioteca();

        // Action we are testing
        biblioteca.start();
        
        // Assert that the action caused the expected result
        assertEquals("Welcome",os.toString());
    }
}

