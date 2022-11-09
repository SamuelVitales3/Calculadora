// IMPORT COMPONENTS OF PROJECT
import main.controller.MockMenu;
import main.view.Menu;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class MenuTest extends TestCase {
    @InjectMocks
    Menu s = new Menu();
    @Mock // Declarem un objecte mock
    MockMenu mM;
    @Before
    public void init(){ //Modifiquem els comportaments als que nosaltres volem
        when(mM.setEntradaTec(1)).thenReturn("Suma");
        when(mM.setEntradaValor1(1)).thenReturn(1.0f);
        when(mM.setEntradaValor2(2)).thenReturn(2.0f);
        when(mM.resultadoFinal("Suma",1.0f,2.0f)).thenReturn(3.0f);
    }
    @Test
    public void mockEntradaTeclado() {
        String entradaTecladoOp = s.setEntradaTecladoOp(1); //entradaTecladoOp té "Suma"
        float valor1 = s.setEntradaValor1(1); //valor1 té 1.0f;
        float valor2 = s.setEntradaValor2(2); //valor2 té 2.0f;
        float resultadoFinal = s.resultadoFinal(entradaTecladoOp, valor1, valor2); // resultadoFinal té 3.0f
        assertEquals("Suma",entradaTecladoOp);
        assertEquals(1.0f,valor1);
        assertEquals(2.0f,valor2);
        assertEquals(3.0f, resultadoFinal);
    }
}