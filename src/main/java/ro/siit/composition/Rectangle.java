package ro.siit.composition;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getArea(){
        return width * height;
    }

    public void balooneyMethod(){
        System.out.println("Balooney Method");
    }
}
