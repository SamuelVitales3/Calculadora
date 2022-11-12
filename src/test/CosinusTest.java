package test;
import junit.framework.TestCase;
import org.junit.Test;
import main.model.Cosinus;

public class CosinusTest extends TestCase{

    @Test
    public void testCosinusConstructor(){
        Cosinus cosinusVar = new Cosinus();
        assertEquals(0.0, cosinusVar.getValor1());
        assertEquals(0.0, cosinusVar.getResult());
    }

    @Test
    public void testCosinusOne(){
        Cosinus sinusVar = new Cosinus(0);
        double resultFunction = sinusVar.cosinus();
        assertEquals(1.0,resultFunction);
    }

    @Test
    public void testNegative_CosinusOne(){
        Cosinus sinusVar = new Cosinus(180);
        double resultFunction = sinusVar.cosinus();
        assertEquals(-1.0,resultFunction);
    }

    @Test
    public void testCosinusZero(){
        Cosinus sinusVar = new Cosinus(90);
        double resultFunction = sinusVar.cosinus();
        assertEquals(0.0,resultFunction);
    }

    @Test
    public void testNegative_CosinusZero(){
        Cosinus sinusVar = new Cosinus(270);
        double resultFunction = sinusVar.cosinus();
        assertEquals(0.0,resultFunction);
    }
}
