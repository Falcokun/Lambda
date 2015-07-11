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

        //UneCadenas
        //EL lambda es el mismo pero el tipo de datos se define a partir del metodo base
        UneCadenas u1 = (s1, s2) -> s1 + s2;
        String rpta = u1.join("Hola", "Mundo Java");
        System.out.println("La cadena: " + rpta);

        //CalculadoraDos
        CalculadoraDos c3 = (n1, n2, n3) -> {
            double suma = 0;
            if (n3 < 5) {
                suma = n1 + n2;
            } else {
                suma = n1 - n2;
            }
            return suma;
        };

        double suma3= c3.suma(1,2,3);
        double suma4= c3.suma(10.5,20.5,31);
        System.out.println("Suma3: " + suma3);
        System.out.println("Suma4: " + suma4);

    }


    //Una interfaz Random
    public interface Calculadora {
        double suma(double n1, double n2);
    }

    @FunctionalInterface
    public interface UneCadenas {
        String join(String s1, String s2);
    }

    public interface CalculadoraDos {
        double suma(double n1, double n2, int n3);
    }
}
