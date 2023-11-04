package JUnit.Junit09_Geometria;

import JUnit.Junit09_Geometria.dto.Geometria;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testAreaCirculo() {
        Geometria gm = new Geometria(2);
        double areaCirc = gm.areaCirculo(2);
        gm.setArea(areaCirc);

        assertEquals(12.5664, areaCirc, 0.01);
        assertEquals(12.5664, gm.getArea(), 0.01);
    }
}
