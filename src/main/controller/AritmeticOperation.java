package main.controller;
//Superclasse que deriva als mètodes de la calculadora
public class AritmeticOperation {
    protected double valor1;
    protected double valor2;
    protected double result;
    public AritmeticOperation() {
        super();
        valor1 = 0;
        valor2 = 0;
        result = 0;
    }
    public double getValor1() {return valor1;}
    public double getValor2() {return valor2;}
    public double getResult() {return result;}
    public void setValor1(float x) {valor1 = x;}
    public void setValor2(float x) {valor2 = x;}
    public void setResult(float x) {
        result = x;}
}

