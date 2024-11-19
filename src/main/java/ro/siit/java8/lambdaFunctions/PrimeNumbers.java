package ro.siit.java8.lambdaFunctions;

import java.util.stream.IntStream;

public class PrimeNumbers {
    public static void main(String[] args) {
        int start = 10;
        int end = 20;
        IntStream.rangeClosed(start, end)
                .filter(number -> {
                    long divisorsCount = IntStream.rangeClosed(2, number/2)
                            .filter(divisor -> number % divisor == 0)
                            .count();
                    return divisorsCount == 0;
                })
                .forEach(System.out::println);
    }
}
