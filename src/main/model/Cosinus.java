package main.model;
import main.controller.AritmeticOperation;


public class Cosinus extends AritmeticOperation{
    public Cosinus() {super();}
    public Cosinus(double x) {
        valor1 = x;
    }

    public double cosinus() {
        if(valor1 == 0 || valor1 == 180)
            result = Math.cos(Math.toRadians(valor1));
        else
            result = Math.floor(Math.cos(Math.toRadians(valor1))*10)/100;
        return result;
    }
}
