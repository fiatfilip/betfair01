package ro.siit.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListsMain {
    public static void main(String[] args) {
        List<Payment> list = new ArrayList<>();
        list.add(new Payment(200));
        list.add(new Payment(300));
        list.add(new Payment(100));
        list.add(new Payment(200));
        list.add(new Payment(50));
        list.add(new Payment(500));

        list.stream().forEach(System.out::println);

        Collections.sort(list);
        System.out.println();

        list.stream().forEach(System.out::println);

        Collections.sort(list, new PaymentDateComparator());
        System.out.println();

        list.stream().forEach(System.out::println);

//        Collections.sort(list, new Comparator<Payment>(){
//            @Override
//            public int compare(Payment o1, Payment o2) {
//                return o1.getDate().compareTo(o2.getDate());
//            }
//        });

 //       Collections.sort(list, (o1, o2) ->  - o1.getDate().compareTo(o2.getDate()));

        Collections.sort(list, Comparator.comparing(Payment::getDate));

        System.out.println();

        list.stream().forEach(System.out::println);
    }
}
