package main.model;
import main.controller.MockPlus;
import main.controller.AritmeticOperation;

public class Plus extends AritmeticOperation {
    MockPlus mockS;
    public Plus(){
        super();
    }
    public Plus(double x, double y){
        valor1 = x;
        valor2 = y;
    }
    public double plus(){
        result = valor1 + valor2;
        return result;
    }
    public double plusMock(double x, double y) {
        //Sumar a la comprovaci√≥
        return mockS.auxiliarSum(x,y);
    }
}