package edu.leoni;

public class SingletonRapido {
    private static SingletonRapido instancia = new SingletonRapido();;

    private SingletonRapido() {
        super();
    }

    public static SingletonRapido getInstncia() {
        return instancia;
    }
}
