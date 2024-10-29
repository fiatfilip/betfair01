package ro.siit.collections;

import java.util.ArrayList;
import java.util.List;

public class ReturnCollections {
    public static void main(String[] args) {
        Cursant george = new Cursant("George", 20);
        george.addCurs(new Curs("Java"));
        george.addCurs(new Curs("Python"));
        george.addCurs(new Curs("C++"));

        System.out.println(george);

        List<Curs> cursuriG = george.getCursuri();

        List<Curs> cursuriGi = new ArrayList<>();
        cursuriGi.add(new Curs("Philosophy"));
        cursuriGi.add(new Curs("Paleontology"));

        cursuriG.addAll(cursuriGi);

        cursuriG.clear();

        System.out.println(george.getCursuri());
    }
}
