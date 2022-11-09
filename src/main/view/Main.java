package main.view;
import main.controller.MockMain;

import java.util.Scanner;

public class Main {
    static int entradaTecladoOp;
    MockMain mockM;
    static float valor1;
    static float valor2;

    public Main() {
        entradaTecladoOp = 0;
        valor1 = 0;
        valor2 = 0;
    }


    //Funciones para el mock
    public String setEntradaTecladoOp(int x) {
        return mockM.setEntradaTec(x);
    }

    public float setEntradaValor1(float v1) {
        return mockM.setEntradaValor1(v1);
    }

    public float setEntradaValor2(float v2) {
        return mockM.setEntradaValor2(v2);
    }

    public float resultadoFinal(String entTec, float v1, float v2) {
        return mockM.resultadoFinal(entTec, v1, v2);
    }

    public static void setEntradaTecladoOp1(int x) {
        entradaTecladoOp = x;
    }


    //Funciones para mi main
    public static void setValor1(float v1) { valor1 = v1;}

    public static void setValor2(float v2) { valor2 = v2;}

    //Implementació del codi de la vista per l'usuari
    public static void main (String[] args)
    {
        String[] actual = new String[0];
        //Print Menú
        System.out.println("        Calculadora     \n ");
        System.out.println("Introduzca la operación a realizar:");
        System.out.println("1 - Suma");
        System.out.println("2 - Resta");
        System.out.println("3 - Multiplicación");
        System.out.println("4 - División");
        System.out.println("5 - Potencia");
        System.out.println("6 - Logaritmo");
        System.out.println("7 - Exponencial");
        System.out.println("8 - Sinus");
        System.out.println("9 - Cosinus");
        System.out.println("10 - Tangente\n");
        int seleccion = 0;
        String operacion = "";
        String continuar = "";
        //Introducció d'un valor per l'usuari per indicar quina operació fer
        Scanner entradaEscaner = new Scanner(System.in);
        seleccion = entradaEscaner.nextInt();
        setEntradaTecladoOp1(seleccion);
        // Comprovem que s'ha introduït un valor correcte
        while ((entradaTecladoOp > 10) || (entradaTecladoOp < 1))
        {
            System.out.println("Error: Introduzca un numero entre el 1-10");
            Scanner entradaEscaner2 = new Scanner(System.in);
            seleccion = entradaEscaner2.nextInt();
        }
        System.out.println(seleccion);
        setEntradaTecladoOp1(seleccion);
        //Definim l'operació escollida per l'usuari
        operacion = switch (entradaTecladoOp) {
            case 1 -> "Suma";
            case 2 -> "Resta";
            case 3 -> "Multiplicación";
            case 4 -> "División";
            case 5 -> "Potencia";
            case 6 -> "Logaritmo";
            case 7 -> "Exponencial";
            case 8 -> "Sinus";
            case 9 -> "Cosinus";
            case 10 -> "Tangente";
            default -> "Error: No ha introducido un valor correcto";
        };
        System.out.println("Ha seleccionado: " + entradaTecladoOp + " - " + operacion + "\n");
        //Print per canviar el tipus d'operació
        System.out.println("Desea cambiar el tipo de operación? S/N \n");
        Scanner entradaEscaner3 = new Scanner(System.in);
        continuar = entradaEscaner3.nextLine();
        //Variables per comprobar si desitja canviar d'operació (s/S, n/N)
        boolean c1, c2, c3, c4;
        c1 = continuar.equals("S");
        c2 = continuar.equals("s");
        c3 = continuar.equals("N");
        c4 = continuar.equals("n");
        while (!c1  && !c2 && !c3 && !c4) {
            System.out.println("Error: No ha introducido un valor correcto \n");
            System.out.println("Desea cambiar el tipo de operación? S/N \n");
            Scanner entradaEscaner4 = new Scanner(System.in);
            continuar = entradaEscaner4.nextLine();
            c1 = continuar.equals("S"); c2 = continuar.equals("s"); c3 = continuar.equals("N"); c4 = continuar.equals("n");
        };
        //float valor1 = 0, valor2 = 0;
        double resultatOp = 0;
        //En cas d'haver premut s/S, tornem a executar la calculadora
        if(c1 || c2) {
            main(actual);
        } //En cas d'haver premut n/N, continuem amb l'execució
        else {
            if((entradaTecladoOp > 0) && (entradaTecladoOp <= 5)) {
                System.out.println("Introduce el primer valor de la operacion: \n");
                Scanner valor1Scan = new Scanner(System.in);
                float auxvalor1 = valor1Scan.nextFloat();
                setValor1(auxvalor1);

                System.out.println("Introduce el segundo valor de la operacion: \n");
                Scanner valor2Scan = new Scanner(System.in);
                float auxvalor2 = valor2Scan.nextFloat();
                setValor2(auxvalor2);
            }
            else { //Determina si l'operació seleccionada requereix d'un valor
                if ((entradaTecladoOp > 5) && (entradaTecladoOp <= 10)) {
                    System.out.println("Introduce el valor de la operacion: \n");
                    Scanner valor1Scan = new Scanner(System.in);
                    float auxvalor1 = valor1Scan.nextFloat();
                    setValor1(auxvalor1);
                }
            }
            switch(entradaTecladoOp) { //Depenent de la operació seleccionada, fem la operació corresponent amb els valors/el valor introduït per l'usuari
                case 1:
                    Suma opSuma = new Suma(valor1, valor2);
                    opSuma.suma();
                    resultatOp = opSuma.getResultado();
                    break;

                case 2:
                    Resta opResta= new Resta(valor1, valor2);
                    opResta.resta();
                    resultatOp = opResta.getResultado();
                    break;

                case 3:
                    Multiplicacion opMultiplicacion = new Multiplicacion(valor1, valor2);
                    opMultiplicacion.multiplicacion();
                    resultatOp = opMultiplicacion.getResultado();
                    break;

                case 4:
                    Division opDivision = new Division(valor1, valor2);
                    opDivision.division();
                    resultatOp = opDivision.getResultado();
                    break;

                case 5:
                    Potencia opPotencia = new Potencia(valor1, valor2);
                    opPotencia.potencia();
                    resultatOp = opPotencia.getResultado();
                    break;

                case 6:
                    Logaritmo opLogaritmo = new Logaritmo(valor1);
                    opLogaritmo.logaritmo();
                    resultatOp = opLogaritmo.getResultadoLog();
                    break;

                case 7:
                    Exponente opExponencial = new Exponente(valor1);
                    opExponencial.exponente();
                    resultatOp = opExponencial.getResultado();
                    break;

                case 8:
                    Sinus opSinus = new Sinus(valor1);
                    opSinus.sinus();
                    resultatOp = opSinus.getResultadoSinus();
                    break;

                case 9:
                    Cosinus opCosinus = new Cosinus(valor1);
                    opCosinus.cosinus();
                    resultatOp = opCosinus.getResultadoCosinus();
                    break;

                case 10:
                    Tangente opTangente = new Tangente(valor1);
                    opTangente.tangente();
                    resultatOp = opTangente.getResultadoTangente();
                    break;

                default:
                    break;
            }
            //Segons si l'operació és d'un o de dos valors, es fa el print corresponent
        if((entradaTecladoOp > 0) && (entradaTecladoOp <= 5)) {
            System.out.printf("El resultado de la operación " + operacion + " entre los valores: " + valor1 + ", "
                    + valor2 + " es: " + resultatOp + "\n" + "\n");
        }
        else {
            if ((entradaTecladoOp > 5) && (entradaTecladoOp <= 10)) {
                System.out.printf("El resultado de la operación " + operacion + " con el valor: " + valor1 +
                        " es: " + resultatOp + "\n" + "\n");
            }
        }//Es realitza la comprobació per saber si vol fer un altre operació o finalitzar el programa
        System.out.print("Desea realizar otra operacion? S/N" + "\n");
        Scanner entradaEscaner5 = new Scanner(System.in);
        continuar = entradaEscaner5.nextLine();
        c1 = continuar.equals("S"); c2 = continuar.equals("s"); c3 = continuar.equals("N"); c4 = continuar.equals("n");

        while (!c1  && !c2 && !c3 && !c4) {
            System.out.println("Error: No ha introducido un valor correcto \n");
            System.out.println("Desea cambiar el tipo de operación? S/N \n");
            Scanner entradaEscaner6 = new Scanner(System.in);
            continuar = entradaEscaner6.nextLine();

            c1 = continuar.equals("S"); c2 = continuar.equals("s"); c3 = continuar.equals("N"); c4 = continuar.equals("n");
        };
        if (c1 || c2) { //En el cas d'haver seleccionat l'opció de tornar a fer un altre operació s/S, tornem al main, sinó (n/N) acabem el programa
            main(actual);
        }
        else{
            System.exit(0);
        }
    }
}
}
