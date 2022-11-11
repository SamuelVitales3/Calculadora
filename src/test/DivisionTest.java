import junit.framework.TestCase;
import main.controller.MockProduct;
import main.model.Division;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class DivisionTest extends TestCase {
    @InjectMocks
    Division d = new Division();
    @Mock
    MockProduct dM;
    @Before
    public void init(){
        when(dM.auxiliarProduct(15.0, 5.0)).thenReturn(10.0);
    }

    @Test
    public void testConstructorDefect(){
        Division d = new Division();
        assertEquals(0.0, d.getValor1());
        assertEquals(0.0, d.getValor2());
        assertEquals(0.0, d.getResult());
    }

    @Test
    public void testConstructor(){
        Division division = new Division(15.0, 5.0);
        assertEquals(15.0, division.getValor1());
        assertEquals(5.0, division.getValor2());
    }

    @Test
    public void testDivision(){
        Division division = new Division(15.0, 5.0);
        assertEquals(3.0, division.division());
    }

    @Test
    public void testDivisionNeg(){
        Division division = new Division(15.0, -5.0);
        assertEquals(-3.0, division.division());
    }

    @Test
    public void testDivisionZero(){
        Division division = new Division(15.0, 0.0);
        assertEquals(/*ERROR - Falta poner algo que te compare con error*/ 1.0,division.division());
    }

}
