package main.model;
import main.controller.MockProduct;
import main.controller.MockSum;
import main.controller.AritmeticOperation;

public class Division extends AritmeticOperation{
    MockProduct mockD;

    public Division(){ super();}

    public Division(double x, double y){
        this.valor1 = x;
        this.valor2 = y;
    }

    public double division(){
        if ((valor1 != 0 && valor2 == 0.0) || (valor1 == 0 && valor2 == 0)
                || (valor1 == 1 && valor2 == 0)) {
            throw new IllegalArgumentException("We couldn't do this operation");
        } else {
            return valor1 / valor2;
        }
    }
}
