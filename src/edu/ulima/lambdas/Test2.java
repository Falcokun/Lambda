package edu.ulima.lambdas;

/**
 * Created by Ricardo on 10/07/2015.
 * Clase 27
 */
public class Test2 {
    public static void main(String[] args) {
        Calculadora suma = (n1, n2) -> n1 + n2;
        Calculadora resta = (n1, n2) -> n1 - n2;
        Calculadora multiplica = (n1, n2) -> n1 * n2;
        Calculadora division = (n1, n2) -> {
            if (n2 == 0) {
                return 0;
            } else {
                return n1 / n2;
            }
        };

        //Im proud of this
        Calculadora divisionCorta = (n1, n2) -> (n2 == 0 ? 0 : n1 / n2);

        int x = 10;
        int y = 2;
        System.out.println("SUMA= " + suma.operacion(x, y));
        System.out.println("RESTA= " + resta.operacion(x, y));
        System.out.println("MULT= " + multiplica.operacion(x, y));
        System.out.println("DIV= " + division.operacion(x, y));
        System.out.println("DIV= " + divisionCorta.operacion(x, y));
    }

    public interface Calculadora {
        double operacion(double n1, double n2);
    }
}
