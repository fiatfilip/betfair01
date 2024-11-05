package ro.siit.concurency.producerConsumer;

import java.util.Random;

public class Producer  extends Thread{
    private Buffer buffer;
    public Producer(Buffer buffer){
        this.buffer = buffer;
    }
    @Override
    public void run() {
        while(true){
            Random random = new Random();
            int value = random.nextInt(100);
            System.out.println("Produced " + value);
            buffer.setValue(value);
        }
    }
}
