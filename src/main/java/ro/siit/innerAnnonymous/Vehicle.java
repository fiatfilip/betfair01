package ro.siit.innerAnnonymous;

public class Vehicle {
    static class Engine{
        private void malfunction(){
            // color = "Gray";
            weight = weight + 200;
        }
    }
    private Engine engine;
    private String color;
    private static double weight;

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
