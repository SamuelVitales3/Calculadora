import main.controller.MockSum;
import main.model.Sum;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class SumTest extends TestCase {
    @InjectMocks
    Sum s = new Sum();
    @Mock
    MockSum sM;
    @Before
    public void init(){
        when(sM.auxiliarSum(5.0, 5.0)).thenReturn(10.0);
    }
    @Test
    public void testConstructorDefecto() {
        Sum x = new Sum();
        assertEquals(0.0, x.getValor1());
        assertEquals(0.0, x.getValor2());
        assertEquals(0.0, x.getResult());
    }
    @Test
    public void testSumConstructor() {
        Sum opArithmetic = new Sum(5.0, 3.0);
        assertEquals(5.0, opArithmetic.getValor1());
        assertEquals(3.0, opArithmetic.getValor2());
    }
    @Test
    public void testSum() {
        Sum opArithmetic = new Sum(5,3);
        double resultFunction = opArithmetic.sum();
        assertEquals(8.0, resultFunction);
    }
    @Test
    public void testNegativeSum() {
        Sum opArithmetic = new Sum(5,-8);
        double resultFunction = opArithmetic.sum();
        assertEquals(-3.0, resultFunction);
    }
    @Test
    public void testSumWithNegativeDoubleNumbers() {
        Sum opArithmetic = new Sum(-10.9999, -20.78528);
        double resultFunction = opArithmetic.sum();
        assertEquals(-31.78518, resultFunction);
    }
    @Test
    public void testSumMock() {
        float result = s.sumMock(5,5);
        assertEquals(10.0, result);
    }
}