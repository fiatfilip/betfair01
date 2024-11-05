package ro.siit.concurency;

import java.util.Arrays;

public class ParalelSorter {
    public int[] sort(int[] array) {
        System.out.println(Thread.currentThread().getName());
        int[] left = new int[array.length / 2];
        int[] right = new int[array.length - array.length / 2];
        for (int i = 0; i < array.length / 2; i++) {
            left[i] = array[i];
           //  System.out.print(left[i]);
        }
        ThreadSorter leftSorter = new ThreadSorter(left);
        Thread lSorter = new Thread(leftSorter);
        // leftSorter.run();
        lSorter.start();
        // System.out.println();
        for (int i = array.length - array.length / 2; i < array.length; i++) {
            right[i - (array.length - array.length / 2) ] = array[i];
            // System.out.print(right[i - (array.length - array.length / 2)]);
        }
        ThreadSorter rightSorter = new ThreadSorter(right);
        Thread rSorter = new Thread(rightSorter);
        // rightSorter.run();
        rSorter.start();

        try {
            lSorter.join();
            rSorter.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        left = leftSorter.getArray();
        right = rightSorter.getArray();
        return intersect(left, right);
    }


    private int[] intersect(int[] array1, int[] array2) {
        int[] result = new int[array1.length + array2.length];
        int index1 = 0, index2 = 0, index = 0;
        while(index1 < array1.length && index2 < array2.length) {
            if(array1[index1] < array2[index2]) {
                result[index++] = array1[index1++];
            } else if(array1[index1] > array2[index2]) {
                result[index++] = array2[index2++];
            } else {
                result[index++] = array1[index1++];
                result[index++] = array2[index2++];
            }
        }
        while(index1 < array1.length) {
            result[index++] = array1[index1++];
        }
        while(index2 < array2.length) {
            result[index++] = array2[index2++];
        }
        return result;
    }

}
