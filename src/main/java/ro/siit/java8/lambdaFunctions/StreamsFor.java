package ro.siit.java8.lambdaFunctions;

import java.util.stream.IntStream;

public class StreamsFor {
    public static void main(String[] args) {
        IntStream intStream = IntStream.of(1, 2, 3, 4, 5);
        intStream.map(x -> x * x).forEach(System.out::println);

        int[] numbers = new int[10];
        IntStream.range(0, 10)
                .forEach(index -> numbers[index] = 2 * (index + 1) );

        IntStream.range(0, numbers.length).forEach(number -> System.out.print(numbers[number] + " "));

    }
}
