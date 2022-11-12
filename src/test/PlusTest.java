package test;
import main.controller.MockPlus;
import main.model.Plus;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class PlusTest extends TestCase {
    @InjectMocks
    Plus s = new Plus();
    @Mock
    MockPlus sM;
    @Before
    public void init(){
        when(sM.auxiliarSum(5.0, 5.0)).thenReturn(10.0);
    }
    @Test
    public void testConstructorDefecto() {
        Plus x = new Plus();
        assertEquals(0.0, x.getValor1());
        assertEquals(0.0, x.getValor2());
        assertEquals(0.0, x.getResult());
    }
    @Test
    public void testSumConstructor() {
        Plus opArithmetic = new Plus(5.0, 3.0);
        assertEquals(5.0, opArithmetic.getValor1());
        assertEquals(3.0, opArithmetic.getValor2());
    }
    @Test
    public void testSum() {
        Plus opArithmetic = new Plus(5,3);
        double resultFunction = opArithmetic.plus();
        assertEquals(8.0, resultFunction);
    }
    @Test
    public void testNegativeSum() {
        Plus opArithmetic = new Plus(5,-8);
        double resultFunction = opArithmetic.plus();
        assertEquals(-3.0, resultFunction);
    }
    @Test
    public void testSumWithNegativeDoubleNumbers() {
        Plus opArithmetic = new Plus(-10.9999, -20.78528);
        double resultFunction = opArithmetic.plus();
        assertEquals(-31.78518, resultFunction);
    }
    @Test
    public void testSumMock() {
        double result = s.plusMock(5,5);
        assertEquals(10.0, result);
    }
}