package ro.siit.concurency;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arrayToSort = new int[]{40, 15, 6, 1, 1, 3, 5, 9, 0, 16, 32, 12, 11, 10, -12};
        // Sorter sorter = new Sorter();
        ParalelSorter sorter = new ParalelSorter();
        int[] sortedArray = sorter.sort(arrayToSort);
        // Arrays.stream(sortedArray).forEach(System.out::println);
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i] + " ");
        }

        System.out.println("Gata programul");
    }
}
