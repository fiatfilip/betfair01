package ro.siit.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Topic {
    private List<Subscriber> subscribers = new ArrayList<>();
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }
    public void notify(String message) {
        for (Subscriber subscriber : subscribers) {
            subscriber.notifyMe(message);
        }
    }
}
