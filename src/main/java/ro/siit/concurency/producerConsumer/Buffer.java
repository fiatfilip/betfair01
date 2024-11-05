package ro.siit.concurency.producerConsumer;

public class Buffer {
    private int value;

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
