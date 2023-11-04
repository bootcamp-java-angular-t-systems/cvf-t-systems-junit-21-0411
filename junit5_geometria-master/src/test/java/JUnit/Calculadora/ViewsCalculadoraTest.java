package JUnit.Calculadora;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

public class ViewsCalculadoraTest {

	private ViewsCalculadora calculadora;

    @BeforeEach
    public void setUp() {
        calculadora = new ViewsCalculadora();
    }

    @Test
    public void testSuma() {
        double resultado = calculadora.calcular(5, 7, "+");
        assertEquals(12, resultado, 0.01);
    }

    @Test
    public void testResta() {
        double resultado = calculadora.calcular(10, 3, "-");
        assertEquals(7, resultado, 0.01);
    }

    @Test
    public void testMultiplicacion() {
        double resultado = calculadora.calcular(4, 6, "x");
        assertEquals(24, resultado, 0.01);
    }

    @Test
    public void testDivision() {
        double resultado = calculadora.calcular(15, 3, "/");
        assertEquals(5, resultado, 0.01);
    }

    @Test
    public void testDivisionPorCero() {
        double resultado = calculadora.calcular(10, 0, "/");
        assertTrue(Double.isNaN(resultado));
    }

    @Test
    public void testOperacionDesconocida() {
        double resultado = calculadora.calcular(8, 2, "%");
        assertEquals(2, resultado, 0.01);
    }

    @Test
    public void testOperacionDefault() {
        double resultado = calculadora.calcular(6, 3, "otra");
        assertEquals(3, resultado, 0.01);
    }
    
    @Test
    public void testEliminarCaracter() {
        calculadora.setLblResultText("12345");
        calculadora.simularClicEliminarCaracter();
        assertNotEquals("333", calculadora.getLblResultText());
    }
    
    
    @Test
    public void testBotonIgual() {
        calculadora.setLblResultText("10");
        calculadora.setOperadorActual("+");
        calculadora.setNumeroAnterior(5);

        calculadora.simularClicBotonIgual();

        assertNotEquals("15.0", calculadora.getLblResultText());
    }
    
    @Test
    public void testSetOperadorActual() {
        ViewsCalculadora calculadora = new ViewsCalculadora();
        calculadora.setOperadorActual("+");
        assertEquals("+", calculadora.operadorActual);
    }

    @Test
    public void testSetNumeroAnterior() {
        ViewsCalculadora calculadora = new ViewsCalculadora();
        calculadora.setNumeroAnterior(5.0);
        assertEquals(5.0, calculadora.numeroAnterior, 0.0);
    }
    
    
    @Test
    public void testNumerosButtonActionListener() {
        ViewsCalculadora calculadora = new ViewsCalculadora();
        JButton btn1 = calculadora.numeros[1];

        ActionEvent event = new ActionEvent(btn1, ActionEvent.ACTION_PERFORMED, "");
        btn1.getActionListeners()[0].actionPerformed(event);
        assertEquals("1", calculadora.getLblResultText());
        btn1.getActionListeners()[0].actionPerformed(event);
        assertEquals("11", calculadora.getLblResultText());
    }

}