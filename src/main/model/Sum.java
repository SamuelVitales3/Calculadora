package main.model;
import main.controller.MockSum;
import main.controller.AritmeticOperation;

public class Sum extends AritmeticOperation {
    MockSum mockS;
    public Sum(){
        super();
    }
    public Sum(double x, double y){
        valor1 = x;
        valor2 = y;
    }
    public double sum(){
        result = valor1 + valor2;
        return result;
    }
    public double sumMock(float x, float y) {
        //Sumar a la comprovació
        return mockS.auxiliarSum(x,y);
    }
}