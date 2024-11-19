package ro.siit.java8.lambdaFunctions;

import java.util.*;

public class LightMain {
    public static void main(String[] args) {
        // Set<LightBulb> lightBulbs = new TreeSet<>(new LightBulbComparator());
        // Set<LightBulb> lightBulbs = new TreeSet<>((o1, o2) -> o1.getPower().compareTo(o2.getPower()));
        Set<LightBulb> lightBulbs = new TreeSet<>(Comparator.comparing(LightBulb::getPower));
        lightBulbs.add(new LightBulb(LightType.COLD, 100));
        lightBulbs.add(new LightBulb(LightType.WARM, 200));
        lightBulbs.add(new LightBulb(LightType.DAYLIGHT, 60));
        lightBulbs.add(new LightBulb(LightType.DAYLIGHT, 70));

        for(LightBulb lightBulb : lightBulbs) {
            System.out.println(lightBulb);
        }

//        List<LightBulb> daylightBulbs = new ArrayList<>();
//        for(LightBulb lightBulb : lightBulbs) {
//            if(lightBulb.getLightType().equals(LightType.DAYLIGHT) && lightBulb.getPower() > 60) {
//                lightBulb.start();
//                daylightBulbs.add(lightBulb);
//            }
//        }
//        System.out.println(daylightBulbs);

        lightBulbs.stream()
                .filter((lightBulb) -> lightBulb.getLightType().equals(LightType.DAYLIGHT))
                .filter(lightBulb -> lightBulb.getPower() > 60)
                //.map(lightBulb -> lightBulb.start())
                .map(LightBulb::start)
                .forEach(System.out::println);

        // (x, y) -> x + y;
    }
}
