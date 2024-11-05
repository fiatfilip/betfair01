package ro.siit.concurency.producerConsumer;

public class Consumer extends Thread{
    private Buffer buffer;
    public Consumer(Buffer buffer){
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while(true){
            System.out.println("Consumed " + buffer.getValue());
        }
    }
}
