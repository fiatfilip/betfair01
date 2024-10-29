package ro.siit.collections;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetMain {
    public static void main(String[] args) {
        // TreeSet<Cursant> treeSet = new TreeSet<>();

//        TreeSet<Cursant> treeSet = new TreeSet<>((o1, o2) -> {
//            if(o1.compareTo(o2) == 0){
//                return - Integer.compare(o1.getVarsta(), o2.getVarsta());
//            }
//            return o1.compareTo(o2);
//        });

        TreeSet<Cursant> treeSet = new TreeSet<>((o1, o2) -> {
           if(o1.getVarsta() == o2.getVarsta()){
               return o1.compareTo(o2);
           }
           return Integer.compare(o1.getVarsta(), o2.getVarsta());
        });

        treeSet.add(new Cursant("Xenia", 25));
        treeSet.add(new Cursant("Corina", 26));
        treeSet.add(new Cursant("Camelia", 27));
        treeSet.add(new Cursant("Daniel", 28));
        treeSet.add(new Cursant("Corina", 25));

        treeSet.stream().forEach(System.out::println);
    }
}
