package main.model;
import main.controller.MockSum;
import main.controller.AritmeticOperation;

public class Sum extends AritmeticOperation {
    MockSum mockS;
    public Sum(){
        super();
    }
    public Sum(float x, float y){
        valor1 = x;
        valor2 = y;
    }
    public float sum(){
        resultado = valor1 + valor2;
        return resultado;
    }
    public float sumMock(float x, float y) {
        //Sumar a la comprovació
        return mockS.auxiliarSum(x,y);
    }
}