package ro.siit.java8.record;

public class Main {
    public static void main(String[] args) {
        var rectangle = new Rectangle(5, 5);
        System.out.println(rectangle.getWidth());

        var rectangle2 = new RectangleRecord(5, 5);
        System.out.println(rectangle2.length());
    }
}
