package ro.siit.composition;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(2, 3);
        System.out.println(rectangle1.getArea());

        Square square = new Square(2, 2);
        System.out.println(square.getArea());
        square.balooneyMethod();

        SmartSquare smartSquare = new SmartSquare(5);
        System.out.println(smartSquare.getArea());
    }
}
