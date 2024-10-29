package ro.siit.collections;

import java.time.LocalDateTime;
import java.util.Comparator;

public class PaymentDateComparator implements Comparator<Payment> {
    @Override
    public int compare(Payment o1, Payment o2) {
        return o2.getDate().compareTo(o1.getDate());
        // return - o1.getDate().compareTo(o2.getDate());
    }
}
