package ro.siit.java8.patternMatching;

public non-sealed class Square implements Shape{
    private double edge;
    public Square(double edge) {
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }
}
