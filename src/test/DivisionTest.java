import junit.framework.TestCase;
import main.model.Division;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DivisionTest extends TestCase {
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
    public void testDivisionZero() {
        Division division = new Division(15.0, 0.0);
        assertThrows(IllegalArgumentException.class, division::division);
    }
}
