package main.model;

import main.controller.AritmeticOperation;

public class Tang extends AritmeticOperation {

    public Tang() {super();}
    public Tang(double x) {
        valor1 = x;
    }

    public double tangent() {
        if(valor1 != 90)
            result = Math.tan(Math.toRadians(valor1));
        else
            throw new IllegalArgumentException("We couldn't do this operation");
        return result;
    }

}
