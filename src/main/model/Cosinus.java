package main.model;
import main.controller.AritmeticOperation;


public class Cosinus extends AritmeticOperation{
    public Cosinus() {super();}
    public Cosinus(double x) {
        valor1 = x;
    }

    public double cosinus() {
        result = Math.cos(Math.toRadians(valor1));
        return result;
    }
}
