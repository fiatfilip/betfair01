package ro.siit.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionIterator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        System.out.println(list.size());
        list.add("A");
        list.add("B");
        System.out.println(list.size());
        list.add("C");

        for (String s : list) {
            System.out.print(s);
        }

        for (String s : list) {
            if(s.contains("B")){
                list.remove(s);
                //          list.add("E");
            }
        }

//        System.out.println();
//        for (String s : list) {
//            System.out.print(s);
//        }
//        System.out.println();

        Iterator<String> iterator = list.iterator();
        boolean exists = false;
        while (iterator.hasNext()) {
            // System.out.print(iterator.next());
            String elem = iterator.next();
            if(elem.contains("A")){
                exists = true;
                list.remove(elem);
            }
        }
        if(exists) {
            list.add("E");
        }

        System.out.println();
        for (String s : list) {
            System.out.print(s);
        }
        System.out.println();

    }
}
