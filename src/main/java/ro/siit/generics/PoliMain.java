package ro.siit.generics;

import java.util.ArrayList;
import java.util.List;

public class PoliMain {
    public static void main(String[] args) {
        // Dog <- Animal
        // List -> ArrayList

        Animal animal  = new Dog();
        List<Animal> animals = new ArrayList<Animal>();
        // List animals = new ArrayList();
       // ArrayList<Animal> animals = new ArrayList<Dog>();
        animals.add(new Dog());
        animals.add(new Cat());
    }
}
