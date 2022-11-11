<<<<<<< HEAD
package test;
import main.model.Pow;
import org.junit.Test;
import junit.framework.TestCase;

public class PowTest extends TestCase
{
    @Test
    public void constructorTest() {
        Pow pow = new Pow(9.0,27.0);
        assertEquals(9.0, pow.getValor1());
        assertEquals(27.0, pow.getValor2());
    }
    public void testConstructorDefecto() {
        Pow pow = new Pow();
        assertEquals(0.0, pow.getValor1());
        assertEquals(0.0, pow.getValor2());
        assertEquals(0.0, pow.getResult());
    }
    @Test
    public void BasicExponentTest()
    {
        Pow pow = new Pow(5,3);
        double result = pow.pow();
        assertEquals(125.0f, result);
    }
    @Test
    public void negativeExponentTest() {
        Pow pow = new Pow(5,-2);
        double result = pow.pow();
        assertEquals(0.04, result);
    }
    @Test
    public void ExponentZeroTest() {
        Pow pow = new Pow(5,0);
        double result = pow.pow();
        assertEquals(1.0, result);
    }
    @Test
    public void BaseIsZeroTest()
    {
        Pow pow = new Pow(0, 7);
        double result = pow.pow();
        assertEquals(0.0, result);
    }
    @Test
    public void DecimalExponentTest() {
        Pow pow = new Pow(2, 0.1);
        double result = pow.pow();
        assertEquals(1.0717734, result);
    }
    @Test
    public void testExponenteInfinty() {
        Pow pow = new Pow(12,500);
        double result = pow.pow();
        boolean isInfinite;
        isInfinite = result > Integer.MAX_VALUE;
        assertTrue(isInfinite);
    }
}
=======
package test;
import org.junit.Test;
import junit.framework.TestCase;

public class PowTest extends TestCase
{
    @Test
    public void constructorTest() {
        Pow pow = new Pow(9.0,27.0);
        assertEquals(9.0, pow.getValor1());
        assertEquals(27.0, pow.getValor2());
    }
    public void testConstructorDefecto() {
        Pow pow = new Pow();
        assertEquals(0.0, pow.getValor1());
        assertEquals(0.0, pow.getValor2());
        assertEquals(0.0, pow.getResult());
    }
    @Test
    public void BasicExponentTest()
    {
        Pow pow = new Pow(5,3);
        double result = pow.pow();
        assertEquals(125.0f, result);
    }
    @Test
    public void negativeExponentTest() {
        Pow pow = new Pow(5,-2);
        double result = pow.pow();
        assertEquals(0.04, result);
    }
    @Test
    public void ExponentZeroTest() {
        Pow pow = new Pow(5,0);
        double result = pow.pow();
        assertEquals(1.0, result);
    }
    @Test
    public void BaseIsZeroTest()
    {
        Pow pow = new Pow(0, 7);
        double result = pow.pow();
        assertEquals(0.0, result);
    }
    @Test
    public void DecimalExponentTest() {
        Pow pow = new Pow(2, 0.1);
        double result = pow.pow();
        assertEquals(1.0717734, result);
    }
    @Test
    public void testExponenteInfinty() {
        Pow pow = new Pow(12,500);
        double result = pow.pow();
        boolean isInfinite;
        isInfinite = result > Integer.MAX_VALUE;
        assertTrue(isInfinite);
    }
}
>>>>>>> 0c806420fb2471299881363bedb5684c925c3c49
