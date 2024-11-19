package ro.siit.java8.lambdaFunctions;

import java.util.Comparator;

public class LightBulbComparator implements Comparator<LightBulb> {
    @Override
    public int compare(LightBulb o1, LightBulb o2) {
        return Integer.compare(o1.getPower(), o2.getPower());
    }
}
