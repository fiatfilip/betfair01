package ro.siit.generics;

public interface Mamal {
    default void identifyAsMamal(){
        System.out.println("Mamal");
    }
}
