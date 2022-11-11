package test;
import junit.framework.TestCase;
import org.junit.Test;
import main.model.Minus;

public class MinusTest extends TestCase
{
    @Test
    public void testMinusConstructor() {
        Minus minus = new Minus();
        assertEquals(0.0, minus.getValor1());
        assertEquals(0.0, minus.getValor2());
        assertEquals(0.0, minus.getResult());
    }
    @Test
    public void MinusTest() {
        Minus opArithmetic = new Minus(5.0, 3.0);
        double resultFunction = opArithmetic.minus();
        assertEquals(8.0,resultFunction);
    }
    @Test
    public void NegativeMinusTest() {
        Minus opArithmetic = new Minus(5.0, -3.0);
        double resultFunction = opArithmetic.minus();
        assertEquals(8.0,resultFunction);
    }

    @Test
    public void Negative_NegativeMinusTest() {
        Minus opArtimetic = new Minus(-5.0, -3.0);
        assertEquals(-2.0, opArtimetic.minus());
    }

}
