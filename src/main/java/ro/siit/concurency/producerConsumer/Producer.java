package ro.siit.concurency.producerConsumer;

import java.util.Random;

public class Producer  extends Thread{
    private Buffer buffer;

    public Producer(String name, Buffer buffer){
        this.buffer = buffer;
        this.setName(name);
    }

    @Override
    public void run() {
        while(true){
            Random random = new Random();
            int value = random.nextInt(100);
            buffer.setValue(value);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
