package ro.siit.java8.lambdaFunctions;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class LightMainStream {
    public static void main(String[] args) {
        List<LightBulb> lightBulbs = new ArrayList<>();
        lightBulbs.add(new LightBulb(LightType.COLD, 100));
        lightBulbs.add(new LightBulb(LightType.WARM, 200));
        lightBulbs.add(new LightBulb(LightType.DAYLIGHT, 60));
        lightBulbs.add(new LightBulb(LightType.DAYLIGHT, 70));

        Supplier<Stream<LightBulb>> lightBulbsSupplier = () -> lightBulbs.stream();

        lightBulbsSupplier.get()
                .filter((lightBulb) -> lightBulb.getLightType().equals(LightType.COLD))
                .filter(lightBulb -> lightBulb.getPower() <= 100)
                //.map(lightBulb -> lightBulb.start())
                .map(LightBulb::start)
                .forEach(System.out::println);

        lightBulbsSupplier.get()
                .filter((lightBulb) -> lightBulb.getLightType().equals(LightType.WARM))
                .filter(lightBulb -> lightBulb.getPower() > 50)
                //.map(lightBulb -> lightBulb.start())
                .map(LightBulb::start)
                .forEach(System.out::println);    }
}
