package ro.siit.java8.patternMatching;

import java.util.regex.Pattern;

public sealed class Triagle implements Shape permits SquareTriangle{
    private double edge1;
    private double edge2;
    private double edge3;
    public Triagle(double edge1, double edge2, double edge3) {
        this.edge1 = edge1;
        this.edge2 = edge2;
        this.edge3 = edge3;
    }

    public double getEdge1() {
        return edge1;
    }

    public double getEdge2() {
        return edge2;
    }

    public double getEdge3() {
        return edge3;
    }
}
