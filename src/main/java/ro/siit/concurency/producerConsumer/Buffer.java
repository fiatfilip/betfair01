package ro.siit.concurency.producerConsumer;

public class Buffer {
    private int value;
    private volatile boolean empty = true;

    public synchronized void setValue(int value) {
        if(!empty) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(Thread.currentThread().getName() + " produced " + value + "(" + empty +")");
        this.value = value;
        empty = false;
        notifyAll();
    }

    public synchronized int getValue() {
        if (empty){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(Thread.currentThread().getName() + " consumed " + value + "(" + empty +")");
        empty = true;
        notifyAll();
        return value;

    }
}
