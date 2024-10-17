package ro.siit.constructorChaining;

public class Person {
    private String name; // = "Ion";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(){
        System.out.println("Person default constructor");
        this.name = "John Doe";
    }

    public Person(String name){
        System.out.println("Person constructor with name");
        this.name = name;
    }

}
