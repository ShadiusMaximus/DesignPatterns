package edu.leoni;

public class SingletonEncapsulado {

    private static class capsulaInstancia {
        public static SingletonEncapsulado instancia = new SingletonEncapsulado();
    }

    private SingletonEncapsulado() {
        super();
    }

    public static SingletonEncapsulado getInstncia() {
        return capsulaInstancia.instancia;
    }
}
