package main.model;
import main.controller.MockProduct;
import main.controller.AritmeticOperation;

public class Divide extends AritmeticOperation{
    MockProduct mockD;
    public Divide(){ super();}

    public Divide(double x, double y){
        this.valor1 = x;
        this.valor2 = y;
    }

    public double divide(){
        if (valor1 != 0 && valor2 == 0 || valor1 == 0 && valor2 == 0) {
            throw new IllegalArgumentException("We couldn't do this operation");
        } else {
            return valor1 / valor2;
        }
    }
}
