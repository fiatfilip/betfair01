package ro.siit.patterns.creational;

public class Main {
    public static void main(String[] args) {
        SigletonPrivateConstructor singletonPrivateconstructor = SigletonPrivateConstructor.getInstance();
        System.out.println(singletonPrivateconstructor);
        SigletonPrivateConstructor singletonPrivateconstructor2 = SigletonPrivateConstructor.getInstance();
        System.out.println(singletonPrivateconstructor2);
    }
}
