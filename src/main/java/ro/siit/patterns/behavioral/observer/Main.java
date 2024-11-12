package ro.siit.patterns.behavioral.observer;

public class Main {
    public static void main(String[] args) {
        Topic messageTopic = new Topic();
        Subscriber s1 = new Subscriber();
        messageTopic.subscribe(s1);
        Subscriber s2 = new Subscriber();
        messageTopic.subscribe(s2);
        Subscriber s3 = new Subscriber();
        messageTopic.subscribe(s3);

        messageTopic.notify("Some message");

        messageTopic.unsubscribe(s2);

        messageTopic.notify("Some other message");

    }
}
