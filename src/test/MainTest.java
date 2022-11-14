package test;

import main.controller.MockMain;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import main.view.Main;


import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class MainTest extends TestCase {
    @InjectMocks
    Main s = new Main();
    @Mock // Declarem un objecte mock
    MockMain mM;
    @Before
    public void init() { // Modifiquem els comportaments als que nosaltres volem
        when(mM.inputTeclado(1)).thenReturn("Plus");
        when(mM.setInput1(1)).thenReturn(1.0);
        when(mM.setInput2(2)).thenReturn(2.0);
        when(mM.finalResult("Plus",1.0,2.0)).thenReturn(3.0);
    }
    @Test
    public void mockEntradaTeclado() {
        String entradaTecladoOp = s.inputTeclado(1); //entradaTecladoOp té "Suma"
        double valor1 = s.setInput1(1); //valor1 té 1.0;
        double valor2 = s.setInput2(2); //valor2 té 2.0;
        double resultadoFinal = s.finalResult(entradaTecladoOp, valor1, valor2); // resultadoFinal té 3.0
        assertEquals("Plus",entradaTecladoOp);
        assertEquals(1.0,valor1);
        assertEquals(2.0,valor2);
        assertEquals(3.0, resultadoFinal);
    }
}