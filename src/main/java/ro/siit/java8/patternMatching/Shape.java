package ro.siit.java8.patternMatching;

public sealed interface Shape permits Rectangle, Square, Circle, Triagle{
    default double perimeter() {
        return switch (this){
            case Circle c -> 2 * Math.PI * c.getRadius();
            case Triagle t -> t.getEdge1() + t.getEdge2() + t.getEdge3();
            case Square s -> s.getEdge() * 4;
            case Rectangle r -> 2 * (r.getHeight() + r.getWidth());
            // default -> 0;
        };
    }
}
