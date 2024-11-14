package ro.siit.java8.patternMatching;

public non-sealed class Circle implements Shape{
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
