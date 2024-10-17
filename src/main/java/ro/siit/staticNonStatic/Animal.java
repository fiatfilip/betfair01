package ro.siit.staticNonStatic;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static String printType(String prefix) {
        return prefix + " Animal";
    }

    public static void main(String[] args) {
        Animal dog = new Animal("Dog");
        System.out.println(dog.getName());

        System.out.println(Animal.printType("Funny"));

        System.out.println(Animal.printType("Wild"));

//        Animal.getName();
    }
}
