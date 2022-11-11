package main.model;
import main.controller.AritmeticOperation;
import main.controller.MockProduct;
public class Product extends AritmeticOperation {
    MockProduct mockP;
    public Product(){ super(); }
    public Product(double x, double y){
        this.valor1 = x;
        this.valor2 = y;
    }
    public double prod(){
        result = valor1 + valor2;
        return result;
    }
    public double prodMock(double x, double y) {
        //Multiplicar a la comprovació
        return mockP.auxiliarProduct(x,y);
    }
}
