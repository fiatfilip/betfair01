package ro.siit.collections;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class MapsMain {
    public static void main(String[] args) {
        Map<UUID, Payment> payments = new HashMap<>();
        UUID id = UUID.randomUUID();
        LocalDateTime now = LocalDateTime.now();
        Payment p1 = new Payment(id, 100.0, now);
        UUID id2 = UUID.randomUUID();
        Payment p2 = new Payment(id2, 100.0, now);
        payments.put(p1.getId(), p1);
        // []
        // 23 -> [p1.id, p2.id]
        // 31 -> [p2.id]
        // 41 -> [p3.id]

        payments.get(p1.getId()); // 31
        payments.put(p2.getId(), p2);

        System.out.println(payments.entrySet().size());

        for (Map.Entry<UUID, Payment> entry : payments.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        for (UUID key : payments.keySet()) {
            System.out.println(key);
            System.out.println(payments.get(key));
        }
    }
}
