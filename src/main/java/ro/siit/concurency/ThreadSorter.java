package ro.siit.concurency;

import java.util.Arrays;

public class ThreadSorter implements Runnable {
    private int[] array;

    public ThreadSorter(int[] array) {
        this.array = array;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        Arrays.sort(array);
    }

    public int[] getArray() {
        return array;
    }
}
