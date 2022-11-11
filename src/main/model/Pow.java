package main.model;

import main.controller.AritmeticOperation;

public class Pow extends AritmeticOperation
{
    public boolean isInfinite;
    public Pow() {
        super();
    }
    public Pow(double v1, double v2) {
        super();
        valor1 = v1;
        valor2 = v2;
    }
    public double pow() {
        result = (float) Math.pow(valor1, valor2);
        return result;
    }
}