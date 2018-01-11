import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BibliotecaTest {

    @Test
    public void shouldReturnWelcomeWhenBibliotecaStarts() {
        // Arrange our objects
        Biblioteca biblioteca = new Biblioteca();

        // Action we are testing
        String result = biblioteca.start();

        // Assert that the action caused the expected result
        assertEquals(result, "Welcome");
    }
}
