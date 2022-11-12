package test;
import junit.framework.TestCase;
import org.junit.Test;
import main.model.Sinus;

public class SinusTest extends TestCase {


    @Test
    public void testSinusConstructor(){
        Sinus sinus = new Sinus();
        assertEquals(0.0, sinus.getValor1());
        assertEquals(0.0, sinus.getResult());
    }

    @Test
    public void testSinusOne(){
        Sinus sinusVar = new Sinus(90);
        double resultFunction = sinusVar.sinus();
        assertEquals(1.0,resultFunction);
    }

    @Test
    public void testNegative_SinusOne(){
        Sinus sinusVar = new Sinus(-90);
        double resultFunction = sinusVar.sinus();
        assertEquals(-1.0,resultFunction);
    }

    @Test
    public void testSinusZero(){
        Sinus sinusVar = new Sinus(0);
        double resultFunction = sinusVar.sinus();
        assertEquals(0.0,resultFunction);
    }

    @Test
    public void testNegative_SinusZero(){
        Sinus sinusVar = new Sinus(180);
        double resultFunction = sinusVar.sinus();
        assertEquals(0.0,resultFunction);
    }
}
