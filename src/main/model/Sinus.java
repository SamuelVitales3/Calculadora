package main.model;
import main.controller.AritmeticOperation;


public class Sinus extends AritmeticOperation{
    public Sinus() {super();}
    public Sinus(double x) {
        valor1 = x;
    }

    public double sinus() {
        result = Math.sin(Math.toRadians(valor1));
        return result;
    }
}
