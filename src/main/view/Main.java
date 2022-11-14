package main.view;
import main.controller.MockMain;
import main.model.*;

import java.util.Scanner;

public class Main {
    static int anInt;
    MockMain mockM;
    static double valor1;
    static double valor2;

    public Main() {
        anInt = 0;
        valor1 = 0;
        valor2 = 0;
    }
    //Funciones para el mock
    public String inputTeclado(int x) {
        return mockM.inputTeclado(x);
    }

    public double setInput1(double v1) {
        return mockM.setInput1(v1);
    }

    public double setInput2(double v2) {
        return mockM.setInput2(v2);
    }

    public double finalResult(String entTec, double v1, double v2) {
        return mockM.finalResult(entTec, v1, v2);
    }

    public static void setInputOp1(int x) {
        anInt = x;
    }

    //Funciones para mi main
    public static void setValor1(double v1) { valor1 = v1;}

    public static void setValor2(double v2) { valor2 = v2;}

    //Implementació del codi de la vista per l'usuari
    public static void main (String[] args)
    {
        String[] actual = new String[0];
        //Print Menú
        System.out.println("        Calculadora     \n ");
        System.out.println("Introduce the operation that you want to do:");
        System.out.println("1 - Plus");
        System.out.println("2 - Minus");
        System.out.println("3 - Product");
        System.out.println("4 - Division");
        System.out.println("5 - Pow");
        System.out.println("6 - Sinus");
        System.out.println("7 - Cosinus");
        System.out.println("8 - Tangent\n");
        int seleccion = 0;
        String operacion = "";
        String continuar = "";
        //Introducció d'un valor per l'usuari per indicar quina operació fer
        Scanner entradaEscaner = new Scanner(System.in);
        seleccion = entradaEscaner.nextInt();
        setInputOp1(seleccion);
        // Comprovem que s'ha introduït un valor correcte
        while ((anInt > 10) || (anInt < 1))
        {
            System.out.println("Error: Introduce a number between 1 and 10");
            Scanner entradaEscaner2 = new Scanner(System.in);
            seleccion = entradaEscaner2.nextInt();
        }
        System.out.println(seleccion);
        setInputOp1(seleccion);
        //Definim l'operació escollida per l'usuari
        switch (anInt) {
            case 1 : operacion =  "Plus";
            case 2 : operacion = "Minus";
            case 3 : operacion = "Product";
            case 4 : operacion = "Division";
            case 5 : operacion =  "Pow";
            case 6 : operacion =  "Sinus";
            case 7 : operacion =  "Cosinus";
            case 8 : operacion = "Tangent";
            default : operacion =  "Error: Don't introduce a valid number";
        };
        System.out.println("Has selected: " + anInt + " - " + operacion + "\n");
        //Print per canviar el tipus d'operació
        System.out.println("Do you want to change the operation? Y/N \n");
        Scanner entradaEscaner3 = new Scanner(System.in);
        continuar = entradaEscaner3.nextLine();
        //Variables per comprobar si desitja canviar d'operació (s/S, n/N)
        boolean c1, c2, c3, c4;
        c1 = continuar.equals("Y");
        c2 = continuar.equals("y");
        c3 = continuar.equals("N");
        c4 = continuar.equals("n");
        while (!c1  && !c2 && !c3 && !c4) {
            System.out.println("Error: Don't introduce valid answer \n");
            System.out.println("Do you want to change the operation? Y/N \n");
            Scanner entradaEscaner4 = new Scanner(System.in);
            continuar = entradaEscaner4.nextLine();
            c1 = continuar.equals("Y"); c2 = continuar.equals("y"); c3 = continuar.equals("N"); c4 = continuar.equals("n");
        };
        //float valor1 = 0, valor2 = 0;
        double resultatOp = 0;
        //En cas d'haver premut s/S, tornem a executar la calculadora
        if(c1 || c2) {
            main(actual);
        } //En cas d'haver premut n/N, continuem amb l'execució
        else {
            if((anInt > 0) && (anInt <= 5)) {
                System.out.println("Introduce the first number of operation: \n");
                Scanner valor1Scan = new Scanner(System.in);
                double auxValor = valor1Scan.nextDouble();
                setValor1(auxValor);

                System.out.println("Introduce the second number of operation: \n");
                Scanner valor2Scan = new Scanner(System.in);
                double auxValor2 = valor2Scan.nextDouble();
                setValor2(auxValor2);
            }
            else { //Determina si l'operació seleccionada requereix d'un valor
                if ((anInt > 5) && (anInt <= 10)) {
                    System.out.println("Introduce the number of operation: \n");
                    Scanner valor1Scan = new Scanner(System.in);
                    double auxValor1 = valor1Scan.nextDouble();
                    setValor1(auxValor1);
                }
            }
            switch(anInt) {
                case 1:
                    Plus opSuma = new Plus(valor1, valor2);
                    opSuma.plus();
                    resultatOp = opSuma.getResult();
                    break;

                case 2:
                    Minus opMinus = new Minus(valor1, valor2);
                    opMinus.minus();
                    resultatOp = opMinus.getResult();
                    break;

                case 3:
                    Product opMultiplicacion = new Product(valor1, valor2);
                    opMultiplicacion.prod();
                    resultatOp = opMultiplicacion.getResult();
                    break;

                case 4:
                    Divide opDivision = new Divide(valor1, valor2);
                    opDivision.divide();
                    resultatOp = opDivision.getResult();
                    break;

                case 5:
                    Pow opPotencia = new Pow(valor1, valor2);
                    opPotencia.pow();
                    resultatOp = opPotencia.getResult();
                    break;
                case 8:
                    Sinus opSinus = new Sinus(valor1);
                    opSinus.sinus();
                    resultatOp = opSinus.getResult();
                    break;
                case 9:
                    Cosinus opCosinus = new Cosinus(valor1);
                    opCosinus.cosinus();
                    resultatOp = opCosinus.getResult();
                    break;
                case 10:
                    Tang opTangente = new Tang(valor1);
                    opTangente.tangent();
                    resultatOp = opTangente.getResult();
                    break;
                default:
                    break;
            }
            //Segons si l'operació és d'un o de dos valors, es fa el print corresponent
        if((anInt > 0) && (anInt <= 5)) {
            System.out.printf("The result of the operation " + operacion + " between values: " + valor1 + ", "
                    + valor2 + " is: " + resultatOp + "\n" + "\n");
        }
        else {
            if ((anInt > 5) && (anInt <= 10)) {
                System.out.printf("The result of the operation " + operacion + " between values: " + valor1 +
                        " is: " + resultatOp + "\n" + "\n");
            }
        }
        System.out.print("Do you want to do another operation? Y/N" + "\n");
        Scanner entradaEscaner5 = new Scanner(System.in);
        continuar = entradaEscaner5.nextLine();
        c1 = continuar.equals("Y"); c2 = continuar.equals("y"); c3 = continuar.equals("N"); c4 = continuar.equals("n");

        while (!c1  && !c2 && !c3 && !c4) {
            System.out.println("Error: Don't introduce a valid value \n");
            System.out.println("Do you want to change the type of operation? Y/N \n");
            Scanner entradaEscaner6 = new Scanner(System.in);
            continuar = entradaEscaner6.nextLine();

            c1 = continuar.equals("Y"); c2 = continuar.equals("y"); c3 = continuar.equals("N"); c4 = continuar.equals("n");
        };
        if (c1 || c2) {
            main(actual);
        }
        else{
            System.exit(0);
        }
    }
}
}
