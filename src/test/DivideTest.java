package test;
import junit.framework.TestCase;
import main.model.Divide;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertThrows;

public class DivideTest extends TestCase {
    @Test
    public void testConstructorDefect(){
        Divide d = new Divide();
        assertEquals(0.0, d.getValor1());
        assertEquals(0.0, d.getValor2());
        assertEquals(0.0, d.getResult());
    }
    @Test
    public void testConstructor(){
        Divide division = new Divide(15.0, 5.0);
        assertEquals(15.0, division.getValor1());
        assertEquals(5.0, division.getValor2());
    }
    @Test
    public void testDivision(){
        Divide division = new Divide(15.0, 5.0);
        assertEquals(3.0, division.divide());
    }
    @Test
    public void testDivisionNeg(){
        Divide division = new Divide(15.0, -5.0);
        assertEquals(-3.0, division.divide());
    }
    @Test
    public void testDivisionZero() {
        Divide division = new Divide(15.0, 0.0);
        assertThrows(IllegalArgumentException.class, division::divide);
    }
}
