package ro.siit.java8.lambdaFunctions;

public class MainFunctionalInterface {
    public static void main(String[] args) {
        Worker programmer = new Worker() {
            @Override
            public void work() {
                System.out.println("Programming all day long...");
            }
        };
        programmer.work();

        Worker cleverProgrammer = () -> System.out.println("Clever working all day long...");
        cleverProgrammer.work();
    }
}
