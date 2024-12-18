package ro.siit.collections;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

public class Payment implements Comparable<Payment> {
    @Override
    public int compareTo(Payment o) {
        return Double.compare(this.amount, o.amount);
    }

    private UUID id;
    private double amount;
    private LocalDateTime date;

    public Payment(double amount) {
        this(UUID.randomUUID(), amount, LocalDateTime.now());
    }

    public Payment(UUID id, double amount, LocalDateTime date) {
        this.id = id;
        this.amount = amount;
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public UUID getId() {
        return id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", amount=" + amount +
                ", date=" + date +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return Double.compare(amount, payment.amount) == 0 &&
                Objects.equals(id, payment.id) &&
                Objects.equals(date, payment.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, amount, date);
    }
}
