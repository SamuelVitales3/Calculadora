package test;
import junit.framework.TestCase;
import main.model.Divide;
import org.junit.Test;
import main.model.Cosinus;

public class CosinusTest extends TestCase{

    @Test
    public void testCosinusConstructor(){
        Cosinus cosinusVar = new Cosinus();
        assertEquals(0.0, cosinusVar.getValor1());
        assertEquals(0.0, cosinusVar.getValor2());
        assertEquals(0.0, cosinusVar.getResult());
    }
    public void testConstructor(){
        Cosinus cosinusVar = new Cosinus(3.14);
        assertEquals(3.14, cosinusVar.getValor1());
    }

    @Test
    public void testCosinusOne(){
        Cosinus cosinusVar = new Cosinus(0);
        double resultFunction = cosinusVar.cosinus();
        assertEquals(1.0,resultFunction);
    }

    @Test
    public void testNegative_CosinusOne(){
        Cosinus cosinusVar = new Cosinus(180);
        double resultFunction = cosinusVar.cosinus();
        assertEquals(-1.0,resultFunction);
    }

    @Test
    public void testCosinusZero(){
        Cosinus cosinusVar = new Cosinus(90);
        double resultFunction = cosinusVar.cosinus();
        assertEquals(0.0,resultFunction);
    }

    @Test
    public void testNegative_CosinusZero(){
        Cosinus cosinusVar = new Cosinus(270);
        double resultFunction = cosinusVar.cosinus();
        assertEquals(-0.01,resultFunction);
    }
}
