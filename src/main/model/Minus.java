package main.model;
import main.controller.AritmeticOperation;

public class Minus extends AritmeticOperation
{
    public Minus()
    {
        super();
    }

    public Minus(double x, double y)
    {
        valor1 = x;
        valor2 = y;
    }

    public double minus()
    {
        result = valor1 - valor2;
        return result;
    }
}
