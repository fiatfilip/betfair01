package ro.siit.concurency;

import java.util.Arrays;

public class Sorter {
    public int[] sort(int[] array) {

        int[] left = new int[array.length / 2];
        int[] right = new int[array.length - array.length / 2];
        for (int i = 0; i < array.length / 2; i++) {
            left[i] = array[i];
           //  System.out.print(left[i]);
        }
        left = sortArray(left);
        // System.out.println();
        for (int i = array.length - array.length / 2; i < array.length; i++) {
            right[i - (array.length - array.length / 2) ] = array[i];
            // System.out.print(right[i - (array.length - array.length / 2)]);
        }
        right = sortArray(right);

        return intersect(left, right);
    }

    private int[] sortArray(int[] array) {
        Arrays.sort(array);
        return array;
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
