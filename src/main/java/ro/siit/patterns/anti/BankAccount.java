package ro.siit.patterns.anti;

import java.util.UUID;

public class BankAccount {
    private final String IBAN;
    private Double balance;
    private BankAccountHolder holder;

    public BankAccount(String IBAN, Double balance, BankAccountHolder holder) {
        this.IBAN = IBAN;
        this.balance = balance;
        this.holder = holder;
    }

    @Override
    public String toString() {
        return IBAN.toString();
    }
}
