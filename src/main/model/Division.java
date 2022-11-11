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
        double x = 1.0;
        if (valor1 == 0.0 || valor2 == 0.0){
            return x; //Syntax error
        } else if (valor1 == 0.0 && valor2 == 0.0) {
            return 0.0;
        } else {
            return valor1/valor2;
        }
    }
}
