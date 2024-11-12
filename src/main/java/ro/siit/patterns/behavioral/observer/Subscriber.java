package ro.siit.patterns.behavioral.observer;

public class Subscriber {
    public void notifyMe(String message) {
        System.out.println(this + " " + message);
    }
}
