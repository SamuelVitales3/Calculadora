import junit.framework.TestCase;
import main.controller.MockProduct;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import main.model.Product;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ProductTest extends TestCase {

    @InjectMocks // Injectem els mocks creats a la línia de sota i els injectem a l'objecte que volem simular
    Product p = new Product();
    @Mock // Creació del mock object
    MockProduct pR;

    @Before // Modifiquem els comportaments als quals nosaltres volem
    public void init(){
        when(pR.auxiliarProduct(5.0f,2.9f)).thenReturn(14.5f);
    }

    @Test
    public void testConstructorDefecto(){
        Product product = new Product();
        assertEquals(0.0f, product.getValor1());
        assertEquals(0.0f, product.getValor2());
        assertEquals(0.0f, product.getResult());
    }

    @Test
    public void testConstructorProduct(){
        Product product = new Product(5.0f, 2.9f);
        assertEquals(5.0f, product.getValor1());
        assertEquals(2.9f, product.getValor2());
    }

    @Test
    public void testProduct(){
        Product product = new Product(5.0f, 2.9f);
        assertEquals(14.5f, product.prod());
    }

    @Test
    public void testProductNegative(){
        Product product = new Product(5.0f, -2.9f);
        assertEquals(-14.5f, product.prod());
    }

    @Test
    public void testProductZero(){
        Product product = new Product(5.0f, 0f);
        assertEquals(0f, product.prod());
    }

    @Test
    public void testProductMock(){
        float resultado = p.prodMock(5.0f,2.9f);
        assertEquals(14.5f,resultado);
    }

}
