package ro.siit.composition;

public class SmartSquare {
    private Rectangle composedRectangle;
    public SmartSquare(int edge) {
        composedRectangle = new Rectangle(edge, edge);
    }

    public int getArea(){
        return composedRectangle.getArea();
    }
}
