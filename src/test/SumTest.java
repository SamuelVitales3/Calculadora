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
public class SumaTest extends TestCase {
    @InjectMocks //Injectem els mocks creats a la linia d'abaix i els injectem al objecte que volem simular
    Sum s = new Sum();
    @Mock //creació del mock object
    MockSum sM;
    @Before //Modifiquem els comportaments als que nosaltres volem
    public void init(){
        when(sM.sumaAuxiliar(5.0f,5.0f)).thenReturn(10.0f);
    }
    @Test
    public void testConstructorDefecto() {
        Sum x = new Sum();
        assertEquals(0.0f, x.getValor1());
        assertEquals(0.0f, x.getValor2());
        assertEquals(0.0f, x.getResultado());
    }
    @Test
    public void testConstructorSuma() {
        Sum opAritmetica = new Sum(5.0f, 3.0f);
        assertEquals(5.0f,opAritmetica.getValor1());
        assertEquals(3.0f,opAritmetica.getValor2());
    }
    //Test interior
    @Test
    public void testSuma() {
        Sum opAritmetica = new Sum(5,3);
        float resultatFuncio = opAritmetica.sum();
        float resultatExpected = 8;
        assertEquals(resultatExpected, resultatFuncio);
    }
    //Test interior
    @Test
    public void testSumaNegativo() {
        Sum opAritmetica = new Sum(5,-8);
        float resultatFuncio = opAritmetica.sum();
        float resultatExpected = -3;
        assertEquals(resultatExpected, resultatFuncio);
    }
    @Test
    public void testSumarMock(){
        float resultado = s.sumMock(5,5);
        assertEquals(10.0f,resultado);
    }
}