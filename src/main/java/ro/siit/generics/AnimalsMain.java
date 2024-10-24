package ro.siit.generics;

import java.util.ArrayList;
import java.util.List;

public class AnimalsMain {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Dog());

        feed(animals);

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());

        feed(dogs);

        buyNewPet(dogs);

        buyNewPet(new ArrayList<Cat>());

        List<? super Animal> animals2 = buyNewPet2(new ArrayList<Mamal>());
        animals2.get(0);
    }

    static void feed(List<? extends Animal> animals){
        for(Animal animal : animals){
            animal.eat();
        }
    }

    static void buyNewPet(List<? extends Animal> animals){
        // animals.add(new Dog());
    }

    static List<? super Animal> buyNewPet2(List<? super Animal> animals){
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Animal(){
            @Override
            public void eat() {
                System.out.println("Sunt un hamster fericit!");
            }
        });
        return animals;
    }
}
