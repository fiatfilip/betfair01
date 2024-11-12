package ro.siit.concurency.producerConsumer;

public class Consumer extends Thread{
    private Buffer buffer;

    public Consumer(String name, Buffer buffer){
        this.buffer = buffer;
        this.setName(name);
    }

    @Override
    public void run() {
        while(true){
            buffer.getValue();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
