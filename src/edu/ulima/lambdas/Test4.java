package edu.ulima.lambdas;

/**
 * Created by Ricardo on 10/07/2015.
 * Clase 27
 */
public class Test4 {
    public static void main(String[] args) {
        Runnable r = () -> System.out.println("Hola!");

        Thread t= new Thread(r);
        t.start();

    }
}
