package edu.leoni;

public class Teste {

    // Testes relacionados ao design pattern
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstncia();
        System.out.println(singleton);
        singleton = Singleton.getInstncia();
        System.out.println(singleton);

        SingletonRapido singletonRapido = SingletonRapido.getInstncia();
        System.out.println(singletonRapido);
        singletonRapido = SingletonRapido.getInstncia();
        System.out.println(singletonRapido);

        SingletonEncapsulado singletonEncapsulado = SingletonEncapsulado.getInstncia();
        System.out.println(singletonEncapsulado);
        singletonEncapsulado = SingletonEncapsulado.getInstncia();
        System.out.println(singletonEncapsulado);

    }
}
