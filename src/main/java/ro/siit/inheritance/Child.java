package ro.siit.inheritance;

public class Child implements Parent1, Parent2{
    @Override
    public void method1() {
        System.out.println("Child m1()");
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.method1();
    }
}
