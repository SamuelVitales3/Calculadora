package main.model;

import main.controller.AritmeticOperation;
import main.controller.MockProduct;

public class Product extends AritmeticOperation {
    MockProduct mockP;
    public Product(){ super(); }
    public Product(float x, float y){
        this.valor1 = x;
        this.valor2 = y;
    }

    public float prod(){
        resultado = valor1 + valor2;
        return resultado;
    }

    public float prodMock(float x, float y) {
        //Multiplicar a la comprovació
        return mockP.auxiliarProduct(x,y);
    }
}
