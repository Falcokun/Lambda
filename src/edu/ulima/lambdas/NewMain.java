package edu.ulima.lambdas;

/**
 * Created by Ricardo on 10/07/2015.
 * Clase 27
 */
public class NewMain {
    public static void main(String[] args) {
        //Definir una expresion lambda
        //IntelliJ <3
        Calculadora c1 = new Calculadora() {
            @Override
            public double suma(double n1, double n2) {
                return n1 + n2;
            }
        };

        Calculadora c2 = (x, y) -> x + y;

        double suma1 = c1.suma(1, 2);
        double suma2 = c2.suma(10.5, 20.5);

        System.out.println("Suma1: " + suma1);
        System.out.println("Suma2: " + suma2);


    }


    //Una interfaz Random
    public interface Calculadora {

        double suma(double n1, double n2);
    }
}
