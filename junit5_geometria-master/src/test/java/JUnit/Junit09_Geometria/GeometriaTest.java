package JUnit.Junit09_Geometria;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import JUnit.Junit09_Geometria.dto.Geometria;

import static org.junit.jupiter.api.Assertions.*;

public class GeometriaTest {

    private Geometria geometria;

    @BeforeEach
    public void setUp() {
        geometria = new Geometria(1);
    }

    @Test
    public void testAreacuadrado() {
        int resultado = geometria.areacuadrado(4);
        assertEquals(16, resultado);
    }

    @Test
    public void testAreaCirculo() {
        double resultado = geometria.areaCirculo(5);
        assertEquals(78.54, resultado, 0.01);
    }

    @Test
    public void testAreatriangulo() {
        int resultado = geometria.areatriangulo(6, 8);
        assertEquals(24, resultado);
    }

    @Test
    public void testArearectangulo() {
        int resultado = geometria.arearectangulo(7, 9);
        assertEquals(63, resultado);
    }


    @Test
    public void testFigura() {
        String resultado = geometria.figura(1);
        assertEquals("cuadrado", resultado);
    }

    @Test
    public void testToString() {
        String resultado = geometria.toString();
        assertEquals("Geometria [id=1, nom=cuadrado, area=0.0]", resultado);
    }
    

    @Test
    public void testAreapentagono() {
        int resultado = geometria.areapentagono(5, 8);
        assertEquals(20, resultado);
    }

    @Test
    public void testArearombo() {
        int resultado = geometria.arearombo(6, 9);
        assertEquals(27, resultado);
    }

    @Test
    public void testArearomboide() {
        int resultado = geometria.arearomboide(7, 10);
        assertEquals(70, resultado);
    }

    @Test
    public void testAreatrapecio() {
        int resultado = geometria.areatrapecio(12, 8, 5);
        assertEquals(50, resultado);
    }
    
    
    @Test
    public void testConstructorPorDefecto() {
        Geometria geometriaPorDefecto = new Geometria();
        assertEquals(9, geometriaPorDefecto.getId());
        assertEquals("Default", geometriaPorDefecto.getNom());
        assertEquals(0.0, geometriaPorDefecto.getArea(), 0.01);
    }
    
    @Test
    public void testFiguraCuadrado() {
        String resultado = geometria.figura(1);
        assertEquals("cuadrado", resultado);
    }

    @Test
    public void testFiguraCirculo() {
        String resultado = geometria.figura(2);
        assertEquals("Circulo", resultado);
    }

    @Test
    public void testFiguraTriangulo() {
        String resultado = geometria.figura(3);
        assertEquals("Triangulo", resultado);
    }

    @Test
    public void testFiguraRectangulo() {
        String resultado = geometria.figura(4);
        assertEquals("Rectangulo", resultado);
    }

    @Test
    public void testFiguraPentagono() {
        String resultado = geometria.figura(5);
        assertEquals("Pentagono", resultado);
    }

    @Test
    public void testFiguraRombo() {
        String resultado = geometria.figura(6);
        assertEquals("Rombo", resultado);
    }

    @Test
    public void testFiguraRomboide() {
        String resultado = geometria.figura(7);
        assertEquals("Romboide", resultado);
    }

    @Test
    public void testFiguraTrapecio() {
        String resultado = geometria.figura(8);
        assertEquals("Trapecio", resultado);
    }

    @Test
    public void testFiguraDefault() {
        String resultado = geometria.figura(10);
        assertEquals("Default", resultado);
    }
    
    @Test
    public void testGetId() {
        int id = geometria.getId();
        assertEquals(1, id);
    }

    @Test
    public void testSetId() {
        geometria.setId(10);
        assertEquals(10, geometria.getId());
    }

    @Test
    public void testGetNom() {
        String nom = geometria.getNom();
        assertEquals("cuadrado", nom);
    }

    @Test
    public void testSetNom() {
        geometria.setNom("Triangulo");
        assertEquals("Triangulo", geometria.getNom());
    }

    @Test
    public void testGetArea() {
        double area = geometria.getArea();
        assertEquals(0.0, area, 0.01);
    }

    @Test
    public void testSetArea() {
        geometria.setArea(15.5);
        assertEquals(15.5, geometria.getArea(), 0.01);
    }
}
