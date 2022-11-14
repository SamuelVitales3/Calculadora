package test;

import junit.framework.TestCase;
import main.model.Tang;
import org.junit.Test;
import static org.junit.Assert.assertThrows;


public class TangTest extends TestCase {


    @Test
    public void testTangConstructor(){
        Tang tang = new Tang();
        assertEquals(0.0, tang.getValor1());
        assertEquals(0.0, tang.getResult());
    }

    @Test
    public void testTangOne(){
        Tang tangVar = new Tang(45);
        double resultFunction = tangVar.tangent();
        assertEquals(0.9999999999999999,resultFunction);
    }
    @Test
    public void testTangZero(){
        Tang tangVar = new Tang(0);
        double resultFunction = tangVar.tangent();
        assertEquals(0.0,resultFunction);
    }
    @Test
    public void testTang60(){
        Tang tangVar = new Tang(60);
        double resultFunction = tangVar.tangent();
        assertEquals(Math.floor(Math.sqrt(3.0)*100)/100,Math.floor(resultFunction*100)/100);
    }
    @Test
    public void testTangUndef(){
        Tang tangentVar = new Tang(90);
        assertThrows(IllegalArgumentException.class,tangentVar::tangent);
    }

}

