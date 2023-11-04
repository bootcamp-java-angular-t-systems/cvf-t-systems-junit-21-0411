package JUnit.Calculadora;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class CalculadoraAppTest {
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void testCalculadoraApp() {
        System.setOut(new PrintStream(outputStreamCaptor));
        CalculadoraApp.main(new String[]{});
        String output = outputStreamCaptor.toString().trim();
        assertTrue(output.contains("javax.swing.JFrame[frame0,0,0,416x438,invalid,title=]"));
    }
}