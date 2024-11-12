package ro.siit.concurency.producerConsumer;

public class Process {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        Producer producer1 = new Producer("Producer1", buffer);
        Producer producer2 = new Producer("Producer2", buffer);
        Consumer consumer1 = new Consumer("Consumer1", buffer);
        Consumer consumer2 = new Consumer("Consumer2", buffer);
        consumer2.start();
        producer1.start();
        consumer1.start();
        producer2.start();
    }
}
