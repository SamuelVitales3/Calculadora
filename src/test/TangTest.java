package test;

import junit.framework.TestCase;
import main.model.Tang;
import org.junit.Test;
import static org.junit.Assert.assertThrows;


public class TangTest extends TestCase {


    @Test
    public void testSinusConstructor(){
        Tang tang = new Tang();
        assertEquals(0.0, tang.getValor1());
        assertEquals(0.0, tang.getResult());
    }

    @Test
    public void testSinusOne(){
        Tang sinusVar = new Tang(45);
        double resultFunction = sinusVar.tangent();
        assertEquals(1.0,resultFunction);
    }
    @Test
    public void testSinusZero(){
        Tang sinusVar = new Tang(0);
        double resultFunction = sinusVar.tangent();
        assertEquals(0.0,resultFunction);
    }
    @Test
    public void testSinus60(){
        Tang sinusVar = new Tang(60);
        double resultFunction = sinusVar.tangent();
        assertEquals(Math.floor(Math.sqrt(3.0)*100)/100,Math.floor(resultFunction*100)/100);
    }
    @Test
    public void testSinusUndef(){
        Tang tangentVar = new Tang(90);
        assertThrows(IllegalArgumentException.class,tangentVar::tangent);
    }

}

