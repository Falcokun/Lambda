package edu.ulima.lambdas;

/**
 * Created by Ricardo on 10/07/2015.
 * Clase 27
 */
public class Test3 {
    public static void main(String[] args) {
        Calculadora c;
        c = getOperacion(1);
        System.out.println("Suma " + c.operacion(1, 2));

        c = getOperacion(2);
        System.out.println("Resta " + c.operacion(1, 2));

        c = getOperacion(3);
        System.out.println("Mu" + c.operacion(1, 2));

        c = getOperacion(4);
        System.out.println("Suma " + c.operacion(1, 2));

    }

    @FunctionalInterface
    public interface Calculadora {
        double operacion(double n1, double n2);
    }

    public static Calculadora getOperacion(int tipo) {
        switch (tipo) {
            case 1:
                return (n1, n2) -> n1 + n2;
            case 2:
                return (n1, n2) -> n1 - n2;
            case 3:
                return (n1, n2) -> n1 * n2;
            case 4:
                return (n1, n2) -> (n2 == 0 ? 0 : n1 / n2);
        }
        return null;
    }
}
