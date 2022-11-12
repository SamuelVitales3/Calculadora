package test;
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
    @InjectMocks
    Product p = new Product();
    @Mock
    MockProduct pR;
    @Before // Modifiquem els comportaments als quals nosaltres volem
    public void init(){
        when(pR.auxiliarProduct(5.0,2.9)).thenReturn(14.5);
    }

    @Test
    public void testConstructorDefecto(){
        Product product = new Product();
        assertEquals(0.0, product.getValor1());
        assertEquals(0.0, product.getValor2());
        assertEquals(0.0, product.getResult());
    }

    @Test
    public void testConstructorProduct(){
        Product product = new Product(5.0, 2.9);
        assertEquals(5.0f, product.getValor1());
        assertEquals(2.9f, product.getValor2());
    }

    @Test
    public void testProduct(){
        Product product = new Product(5.0, 2.9);
        assertEquals(14.5, product.prod());
    }

    @Test
    public void testProductNegative(){
        Product product = new Product(5.0, -2.9);
        assertEquals(-14.5, product.prod());
    }

    @Test
    public void testProductZero(){
        Product product = new Product(5.0, 0);
        assertEquals(0, product.prod());
    }

    @Test
    public void testProductMock(){
        double resultado = p.prodMock(5.0,2.9);
        assertEquals(14.5,resultado);
    }

}
