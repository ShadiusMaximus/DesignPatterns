package edu.leoni;

public class Singleton {

    private static Singleton instancia;

    private Singleton() {
        super();
    }

    public static Singleton getInstncia() {
        if (instancia == null) {
            instancia = new Singleton();
        }
        return instancia;
    }
}
