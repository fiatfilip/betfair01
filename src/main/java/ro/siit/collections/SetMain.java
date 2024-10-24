package ro.siit.collections;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.HashSet;
import java.util.UUID;

public class SetMain {
    public static void main(String[] args) {
        Set<Payment> payments = new HashSet<>();
        UUID id = UUID.randomUUID();
        LocalDateTime now = LocalDateTime.now();
        Payment p1 = new Payment(id, 100.0, now);
        Payment p2 = new Payment(id, 100.0, now);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1.equals(p2));

        payments.add(p1);
        payments.add(p2);

        System.out.println(payments.size());

    }
}
